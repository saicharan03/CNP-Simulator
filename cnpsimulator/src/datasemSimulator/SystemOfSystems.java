package datasemSimulator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import kanbanBoard.KanbanBoard;

import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.util.FastMath;

import processModels.ValueFunction;
import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ISchedule;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.parameter.Parameters;
import serviceProviders.ResourceEntity;
import serviceProviders.ServiceProviderAgent;
import workItems.AggregationNode;
import workItems.WorkItemEntity;
import xtext.objectsModel.RequiredService;
import xtext.objectsModel.Service;
import xtext.objectsModel.ServiceProviderType;
import xtext.objectsModel.Skill;
import xtext.objectsModel.WorkItemType;

public class SystemOfSystems {
	public String ModelBuilder;
	public Context<Object> context;
	public ServiceProviderAgent coordinator;
	public Parameters parameters;
	
	public HashMap<Integer, ServiceProviderAgent> myServiceProviderAgents = new HashMap<Integer, ServiceProviderAgent>();
	public HashMap<Integer, WorkItemEntity> myWorkItemEntities = new HashMap<Integer, WorkItemEntity>();
	public HashMap<Integer, ResourceEntity> myResourceEntities = new HashMap<Integer, ResourceEntity>();
	public HashMap<Integer, ServiceProviderType> myServiceProviderTypes;
	public HashMap<Integer, WorkItemType> myWorkItemTypes;
	public HashMap<Integer, Service> myServices;
	public KanbanBoard myKanbanBoard;
	
	public int OrgLevels;
	public int OrgComplexity;
	public int WINLevels;
	public int WINComplexity;
	public int WINSize;
	
	public HashMap<Integer, WorkItemEntity> initialList = new HashMap<Integer, WorkItemEntity>();
	public HashMap<Integer, WorkItemEntity> arrivedList = new HashMap<Integer, WorkItemEntity>();
	public LinkedList<WorkItemEntity> endedList = new LinkedList<WorkItemEntity>();
	public int timeNow;
	private int WICount;
	
	// Summary
	private HashMap<Service,Double> serviceEfforts = new HashMap<Service,Double>();
	private HashMap<Service,Double> serviceCapacities = new HashMap<Service,Double>();
	// Time Series Records
	private List<Double> recordAgentsResourceUtilization_cov = new ArrayList<Double>();	
	// End Run Statistics
	private int EndTime;	
	private int CountTasks;
	private double ValueDelivered;
	private double NPV;
	private double TaskReworkCount_total;
	private double TaskReworkCount_mean;
	private double TaskReworkCount_stdev;
	private double ChangePropagationCount_total;
	private double ChangePropagationCount_mean;
	private double ChangePropagationCount_stdev;
	private double CycleTimeToEffortsRatio_mean;
	private double CycleTimeToEffortsRatio_stdev;
	private double AgentsBottleNeckCount_total;
	private double AgentsBottleNeckCount_mean;
	private double AgentsBottleNeckCount_stdev;
	private double AgentsWorkloadInbalance;
	private double AgentsResourceUtilization_cov;
	private double AgentsResourceUtilization_mean;
	
	public int TaskMaturityLevels;
	public double TaskUncertainty;
	public double ReworkRisk;
	public double ROR;
	public double LearningFactor;
	public double MultiTaskingPenalty;
	
	public SystemOfSystems(Context<Object> context) {
		this.context = context;

	}
	@ScheduledMethod(start=1,interval=1,priority=1000)
	public void step() {
		ISchedule schedule = RunEnvironment.getInstance().getCurrentSchedule();
		this.timeNow = (int)schedule.getTickCount();
		CheckEndRunCondition();
		
		for (WorkItemEntity wi:this.arrivedList.values()) {
			wi.setPreviousProgress(wi.getProgress());
		}		
		ReleaseWIs();
		
	}
	public void CheckEndRunCondition() {
		for (WorkItemEntity task:this.endedList){
			//this.context.remove(task);
			this.arrivedList.remove(task);
		}
		this.endedList.clear();
		//System.out.println("\n ============== TIME NOW: "+timeNow+" ============== ");
		if (this.initialList.size()==0){
			RunEnvironment.getInstance().endRun();
			System.out.println("\nSIMULATION ENDED: All WIs Completed\n");
			this.EndRunIndicators();
			this.EndRunAgentsStatistics();
			System.out.println("\n----------------------------------------------------");
		}
//		else {
//			for (WorkItemEntity wi:initialList.values()) {
//				System.out.println("left:"+wi.fullName);
//			}
//		}
	}
	@ScheduledMethod(start=1,interval=1,priority=10)
	public void RecordData() {
		double[] AgentsResourceUtilization = new double[this.myServiceProviderAgents.size()];
		double AgentsResourceUtilization_mean = 0;
		double AgentsResourceUtilization_stdev = 0;
		double AgentsResourceUtilization_cov = 0;
		for (int i=0; i< this.myServiceProviderAgents.size(); i++) {
			ServiceProviderAgent sp = this.myServiceProviderAgents.get(i+1);
			AgentsResourceUtilization[i] = sp.getResourceUtilization();
		}
		AgentsResourceUtilization_mean = StatUtils.mean(AgentsResourceUtilization);
		AgentsResourceUtilization_stdev	= FastMath.sqrt(StatUtils.variance(AgentsResourceUtilization));
		if (AgentsResourceUtilization_stdev!=0) {
			AgentsResourceUtilization_cov = AgentsResourceUtilization_stdev/AgentsResourceUtilization_mean;
		}		
		this.AgentsResourceUtilization_mean = AgentsResourceUtilization_mean;
		this.AgentsResourceUtilization_cov = AgentsResourceUtilization_cov;
		recordAgentsResourceUtilization_cov.add(AgentsResourceUtilization_cov);
		//System.out.println("AgentsResourceUtilization:\n mean="+AgentsResourceUtilization_mean+" stdev="+AgentsResourceUtilization_stdev+" cov="+AgentsResourceUtilization_cov);
	}
	
	public void ReleaseWIs() {
		for (WorkItemEntity wi:this.initialList.values()) {
			if ((!wi.isActivated)&&(wi.arrivalTime <= this.timeNow)) {
				this.context.add(wi);
				wi.SoS.arrivedList.put(wi.getId(), wi);
				wi.isActivated = true;
				wi.activatedTime = this.timeNow;
				this.coordinator.getRequestedQ().add(wi);
				wi.setRequester(this.coordinator);
				wi.setAssignedAgent(this.coordinator);
				//System.out.println("\nINCOMING @TIME:"+timeNow+wi.fullName+"initialized at "+this.coordinator.getName());
			}
		}
	}

	public void printSoSInformation() {
		System.out.println("\n");
		for (Service service:this.myServices.values()) {
			this.serviceEfforts.put(service, 0.0);
			this.serviceCapacities.put(service, 0.0);
		}
		for (WorkItemEntity wi:this.myWorkItemEntities.values()) {
			System.out.println("\nWorkItemEntity:"+wi.fullName+":");
			if (wi.isAggregationNode) {
				System.out.println(" Process Model: "+((AggregationNode)wi).getProcessModelName());
				System.out.println(" Supported by:");
				AggregationNode aggr = (AggregationNode)wi;
				for (WorkItemEntity sub:aggr.getSubtasks()) {
					System.out.println(sub.fullName);
				}
				System.out.println(" Required Analysis:");
				for (RequiredService s:wi.myWorkItem.getRequiredAnalysis()) {
					Service service = s.getServiceType();
					double efforts = s.getEfforts();
					double sEfforts = serviceEfforts.get(service);
					sEfforts += efforts; 
					serviceEfforts.put(service,sEfforts);
					System.out.println(" "+service.getName()+"(serviceId:"+service.getId()+") efforts: "+efforts);
				}
			}
//			else {
				System.out.println(" Required Services:");
				for (RequiredService s:wi.myWorkItem.getRequiredServices()) {
					Service service = s.getServiceType();
					double efforts = s.getEfforts();
					double sEfforts = serviceEfforts.get(service);
					sEfforts += efforts; 
					serviceEfforts.put(service,sEfforts);
					System.out.println(" "+service.getName()+"(serviceId:"+service.getId()+") efforts: "+efforts);
//				}
			}
		}
		for (ServiceProviderAgent sp:this.myServiceProviderAgents.values()) {
			System.out.println("\nServiceProviderAgent: ");
			System.out.println("serviceProviderId: "+sp.getId()+" name: "+sp.getName()+" type:"+this.myServiceProviderTypes.get(sp.typeId).getName());
			System.out.println("-- ResourceEntities:");
			for (ResourceEntity r:sp.getMyResourceEntities()) {
				System.out.println(" resourceId: "+r.getId()+" name: "+r.getName());
				System.out.println("  SkillSet:");
				for (Skill sk:r.getSkillSet()) {
					Service service = sk.getService();
					double sCapabilities = serviceCapacities.get(service);
					sCapabilities += sk.getEfficiency(); 
					serviceCapacities.put(service,sCapabilities);
					System.out.println("  "+service.getName()+"(serviceId:"+service.getId()+") efficiency: "+sk.getEfficiency());
				}
			}
			System.out.println("-- Service Capacities:");
			for (Service service:this.myServices.values()) {
				System.out.println(" Service: "+service.getName()+" "+sp.ServiceCapacity.get(service)+" ext:"+sp.ExtendedServiceCapacity.get(service));
			}
		}
		System.out.println("\n\nService Summary:");
		for (Service service:this.myServices.values()) {
			System.out.println(service.getName()+" total efforts: "+serviceEfforts.get(service));
			System.out.println(service.getName()+" total capabilities: "+serviceCapacities.get(service));
			if (serviceEfforts.get(service)>0 && serviceCapacities.get(service)<=0) {
				String msg = "ERROR: No Resource providing Service Type: "+service.getName()+"\nplease revise your Scenario";
				JOptionPane.showMessageDialog(null,msg);
				throw new RuntimeException(msg);
			}
		}
		System.out.println("\n\n");
	}
	public int getServiceId(String name) {
		int id=0;
		for (Service service:this.myServices.values()) {
			if (name.matches(service.getName())) {
				id = service.getId();
				break;
			}
		}
		return id;
	}
	public int getWorkItemTypeId(String name) {
		int id=0;
		for (WorkItemType type:this.myWorkItemTypes.values()) {
			if (name.matches(type.getName())) {
				id = type.getId();				
				break;
			}
		}
		return id;
	}
	public void EndRunIndicators() {
		this.EndTime = this.timeNow-1;
//		String observewiType = "DevTask";
//		int observewiTypeId = this.getWorkItemTypeId(observewiType);
		int wi_count = 0;
		for (WorkItemEntity wi : arrivedList.values()) {
//			if (wi.typeId==observewiTypeId) {
			if (wi.isDevTask) {
				wi_count++;				
			}
		}
		CountTasks = wi_count;
		double[] TaskReworkCount = new double[wi_count];		
		double[] ChangePropagationCount = new double[wi_count];
		double[] CycleTimeToEffortsRatio = new double[wi_count];		
		int i = 0;
		for (WorkItemEntity wi : arrivedList.values()) {		
//			if (wi.typeId==observewiTypeId) {
			if (wi.isDevTask) {
				TaskReworkCount[i] = wi.getReworkCount();
				ChangePropagationCount[i] = wi.getChangePropagationByCount();
				CycleTimeToEffortsRatio[i] = wi.getCycleTimeToEffortsRatio();
				i++;
			}
		}
		TaskReworkCount_total = StatUtils.sum(TaskReworkCount);
		TaskReworkCount_mean = StatUtils.mean(TaskReworkCount);
		TaskReworkCount_stdev = FastMath.sqrt(StatUtils.variance(TaskReworkCount));
		ChangePropagationCount_total = StatUtils.sum(ChangePropagationCount);
		ChangePropagationCount_mean = StatUtils.mean(ChangePropagationCount);
		ChangePropagationCount_stdev = FastMath.sqrt(StatUtils.variance(ChangePropagationCount));
		CycleTimeToEffortsRatio_mean = StatUtils.mean(CycleTimeToEffortsRatio);
		CycleTimeToEffortsRatio_stdev = FastMath.sqrt(StatUtils.variance(CycleTimeToEffortsRatio));
		AgentsWorkloadInbalance = StatMean(recordAgentsResourceUtilization_cov);
		
		double[] AgentsBottleNeckCount = new double[myServiceProviderAgents.size()];
		int j = 0;
		for (ServiceProviderAgent sp : myServiceProviderAgents.values()) {
			AgentsBottleNeckCount[j] = sp.getBottleneckCount();
			j++;
		}
		AgentsBottleNeckCount_total = StatUtils.sum(AgentsBottleNeckCount);
		AgentsBottleNeckCount_mean = StatUtils.mean(AgentsBottleNeckCount);
		AgentsBottleNeckCount_stdev = FastMath.sqrt(StatUtils.variance(AgentsBottleNeckCount));
		
		System.out.println("EndTime: "+EndTime);
		System.out.println("Value Delivered: "+this.ValueDelivered);
		System.out.println("NPV: "+this.NPV);
		System.out.println("\nCountTasks: "+CountTasks);
		System.out.println("TaskReworkCount:\n total: "+TaskReworkCount_total+" mean: "+TaskReworkCount_mean+" stdev: "+TaskReworkCount_stdev);
		System.out.println("ChangePropagationCount:\n total: "+ChangePropagationCount_total+" mean: "+ChangePropagationCount_mean+" stdev: "+ChangePropagationCount_stdev);
		System.out.println("CycleTimeToEffortsRatio:\n mean: "+CycleTimeToEffortsRatio_mean+" stdev: "+CycleTimeToEffortsRatio_stdev);
		System.out.println("AgentsBottleNeckCount:\n total: "+AgentsBottleNeckCount_total+" mean: "+AgentsBottleNeckCount_mean+" stdev: "+AgentsBottleNeckCount_stdev);
		System.out.println("AgentsWorkloadInbalance: "+AgentsWorkloadInbalance);
		System.out.println("\n");
	}
	
	public void EndRunAgentsStatistics() {
		//System.out.println("\nAgents Statistics:");
		for (int i=0; i< this.myServiceProviderAgents.size(); i++) {
			ServiceProviderAgent sp = this.myServiceProviderAgents.get(i+1);
			sp.EndRunStatistics();			
//			System.out.println("\n-- ServiceProviderAgent id:"+sp.getId()+" name:"+sp.getName());
//			System.out.println("TotalWorkLoad_mean: "+sp.getTotalWorkLoad_mean());
//			System.out.println("TotalWorkLoad_stdev: "+sp.getTotalWorkLoad_stdev());
//			System.out.println("ActiveWorkload_mean: "+sp.getActiveWorkload_mean());
//			System.out.println("ActiveWorkload_stdev: "+sp.getActiveWorkload_stdev());
//			System.out.println("ResourceUtilization_mean: "+sp.getResourceUtilization_mean());
//			System.out.println("ResourceUtilization_stdev: "+sp.getResourceUtilization_stdev());
//			System.out.println("BottleNeckCount: "+sp.getBottleNectCount());
		}
	}
	public int getWICount() {
		return this.WICount;
	}
	public void increaseWICount() {
		this.WICount++;
	}
	public double getValueDelivered() {
		return this.ValueDelivered;
	}
	public double getNPV() {
		return this.NPV;
	}
	public void deliverValue(double addValue) {
		this.ValueDelivered+=addValue;
		this.NPV+=addValue/Math.pow(1+ROR/360, timeNow);
	}
	public double getAgentsResourceUtilization_mean() {
		return this.AgentsResourceUtilization_mean;
	}
	public double getAgentsResourceUtilization_cov() {
		return this.AgentsResourceUtilization_cov;
	}
	public int getEndTime() {
		return EndTime;
	};
	public int getCountTasks() {
		return CountTasks;
	}
	public double getTaskReworkCount_total() {
		return TaskReworkCount_total;
	};
	public double getTaskReworkCount_mean() {
		return TaskReworkCount_mean;
	};
	public double getTaskReworkCount_stdev() {
		return TaskReworkCount_stdev;
	};
	public double getChangePropagationCount_total() {
		return ChangePropagationCount_total;
	};
	public double getChangePropagationCount_mean() {
		return ChangePropagationCount_mean;
	};
	public double getChangePropagationCount_stdev() {
		return ChangePropagationCount_stdev;
	};
	public double getCycleTimeToEffortsRatio_mean() {
		return CycleTimeToEffortsRatio_mean;
	};
	public double getCycleTimeToEffortsRatio_stdev() {
		return CycleTimeToEffortsRatio_stdev;
	};
	private double StatMean(List<Double> list) {
		double[] numbers = new double[list.size()];
		double value = 0;
		for (int i=0;i<list.size();i++) {
			numbers[i] = list.get(i);
		}
		value = StatUtils.mean(numbers);
		return value;
	}
	private double StatStdev(List<Double> list) {
		double[] numbers = new double[list.size()];
		double value = 0;
		for (int i=0;i<list.size();i++) {
			numbers[i] = list.get(i);
		}
		value = FastMath.sqrt(StatUtils.variance(numbers));
		return value;
	}
}
