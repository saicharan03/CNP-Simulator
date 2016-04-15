package serviceProviders;

import governanceModels.AgentStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;

import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.util.FastMath;

import contractNetProtocol.CNPBehavior;
import datasemSimulator.SystemOfSystems;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.util.ContextUtils;
import repast.simphony.context.Context;
import visualization.Icon;
import workItems.AggregationNode;
import workItems.AnalysisActivity;
import workItems.ResolutionActivity;
import workItems.DevTask;
import workItems.Task;
import workItems.WorkItemEntity;
import xtext.objectsModel.Service;
import xtext.objectsModel.ServiceProvider;
import xtext.objectsModel.Skill;
import xtext.objectsModel.impl.ServiceProviderImpl;


public class ServiceProviderAgent extends ServiceProviderImpl {

	public SystemOfSystems SoS;
	// Static Attributes
	public ServiceProvider myServiceProvider;
	public int typeId;
	public int hierarchy = 0;
	//***
	public AbstractAgentBehavior myBehavior;
	//***
	public AgentStrategy myStrategy;
	public LinkedList<ResourceEntity> myResourceEntities = new LinkedList<ResourceEntity>();
	public LinkedList<ServiceProviderAgent> assignWITo = new LinkedList<ServiceProviderAgent>();
	public LinkedList<ServiceProviderAgent> borrowResourceFrom = new LinkedList<ServiceProviderAgent>();		
	private LinkedList<WorkItemEntity> requestedQ = new LinkedList<WorkItemEntity>();
	private LinkedList<Task> assignmentQ = new LinkedList<Task>();	
	private LinkedList<Task> backlogQ = new LinkedList<Task>();
	private LinkedList<Task> activeQ = new LinkedList<Task>();
	private LinkedList<AggregationNode> complexQ = new LinkedList<AggregationNode>();
	private LinkedList<WorkItemEntity> completeQ = new LinkedList<WorkItemEntity>();
	public LinkedList<Task> tempQ = new LinkedList<Task>();
	public HashMap<Service,Double> ServiceCapacity = new HashMap<Service,Double>();
	public HashMap<Service,Double> ExtendedServiceCapacity = new HashMap<Service,Double>();
	
	private static final int BASE_PRIORITY = 200;		
	// Visualization
	public Icon icon = new Icon();
	// Dynamic Attributes
	public LinkedList<ServiceProviderAgent> NowRequested = new LinkedList<ServiceProviderAgent>();
	private double TotalWorkload;
	private double ActiveWorkload;
	private double ResourceUtilization;
	private int isBottleNeck;		
	private int BottleNeckCount;
	// Time Series Records
	private List<Double> recordTotalWorkload = new ArrayList<Double>();
	private List<Double> recordActiveWorkload = new ArrayList<Double>();
	private List<Double> recordResourceUtilization = new ArrayList<Double>();
	// End Run Statistics
	private double TotalWorkLoad_mean;
	private double TotalWorkLoad_stdev;
	private double ActiveWorkload_mean;
	private double ActiveWorkload_stdev;
	private double ResourceUtilization_mean;
	private double ResourceUtilization_stdev;
			
	public ServiceProviderAgent(ServiceProvider ServiceProvider) {
		this.myServiceProvider = ServiceProvider;
		this.name = ServiceProvider.getName();
		this.id = ServiceProvider.getId();
		this.type = ServiceProvider.getType();
		this.typeId = ServiceProvider.getType().getId();
		this.hierarchy = ServiceProvider.getType().getHierarchy();
		this.myStrategy = new AgentStrategy(ServiceProvider.getGovernanceStrategy());
		if (myStrategy.isPull){
			this.myBehavior = new CNPBehavior();
			//this.myBehavior = new AbstractAgentBehavior();
		}
		else {
			this.myBehavior = new AbstractAgentBehavior();
		}
		this.myBehavior.setAgent(this);
	}
	
	@ScheduledMethod(start=1,interval=1,shuffle=false,priority=BASE_PRIORITY-1)
	public void step_1() {
		myBehavior.GoToStep(1);
	}
	@ScheduledMethod(start=1,interval=1,shuffle=false,priority=BASE_PRIORITY-2)
	public void step_2() {
		myBehavior.GoToStep(2);
	}
	@ScheduledMethod(start=1,interval=1,shuffle=false,priority=BASE_PRIORITY-3)
	public void step_3() {
		myBehavior.GoToStep(3);
	}
	@ScheduledMethod(start=1,interval=1,shuffle=false,priority=BASE_PRIORITY-4)	
	public void step_4() {
		myBehavior.GoToStep(4);
	}
	@ScheduledMethod(start=1,interval=1,shuffle=false,priority=BASE_PRIORITY-5)	
	public void step_5() {
		myBehavior.GoToStep(5);
	}
	@ScheduledMethod(start=1,interval=1,shuffle=false,priority=BASE_PRIORITY-6)	
	public void step_6() {
		myBehavior.GoToStep(6);
	}
	@ScheduledMethod(start=1,interval=1,shuffle=false,priority=BASE_PRIORITY-7)	
	public void step_7() {
		myBehavior.GoToStep(7);
	}
	@ScheduledMethod(start=1,interval=1,shuffle=false,priority=BASE_PRIORITY-8)	
	public void step_8() {
		myBehavior.GoToStep(8);
	}
	@ScheduledMethod(start=1,interval=1,shuffle=false,priority=BASE_PRIORITY-9)	
	public void step_9() {
		myBehavior.GoToStep(9);
	}
	@ScheduledMethod(start=1,interval=1,shuffle=false,priority=BASE_PRIORITY-10)	
	public void step_10() {
		myBehavior.GoToStep(10);
	}
	@ScheduledMethod(start=1,interval=1,shuffle=false,priority=BASE_PRIORITY-11)	
	public void step_11() {
		myBehavior.GoToStep(11);
	}
	@ScheduledMethod(start=1,interval=1,shuffle=false,priority=BASE_PRIORITY-12)	
	public void step_12() {
		myBehavior.GoToStep(12);
	}	
	
	

	
	public void analyzeAggregationNode(AggregationNode aggrNode) {
		if (aggrNode.totalAnalysisStages>0) {
			AnalysisActivity analysisActivity = new AnalysisActivity(aggrNode);
			analysisActivity.setRequester(aggrNode.getRequester());
			//
			@SuppressWarnings("unchecked")
			Context<Object> context = ContextUtils.getContext(this);	
			context.add(analysisActivity);
			//
			SoS.arrivedList.put(analysisActivity.getId(), analysisActivity);
			this.requestedQ.add(analysisActivity);
			//analysisActivity.setAssigned();
			//System.out.println("\nANALYSIS AGGREGATION NODE @TIME:"+SoS.timeNow+" Agent "+this.name+" start analyzing"+aggrNode.fullName);
		}
		else {
			releaseSubtasks(aggrNode);
		}
	}	
	public void requestAssistance(DevTask devTask) {
		ResolutionActivity resolutionActivity = new ResolutionActivity(devTask);
		//
		@SuppressWarnings("unchecked")
		Context<Object> context = ContextUtils.getContext(this);	
		context.add(resolutionActivity);
		//
		SoS.arrivedList.put(resolutionActivity.getId(), resolutionActivity);
		this.activeQ.remove(devTask);
		devTask.withdrawAllResources();
		this.backlogQ.add(devTask);	
		devTask.getRequester().requestedQ.add(resolutionActivity);
	}
	public void requestService(WorkItemEntity newWI, ServiceProviderAgent requestToSP) {
		requestToSP.requestedQ.add(newWI);		
		newWI.setRequester(this);
		//newWI.triggerCausalities();
		//System.out.println("\nREQUEST SERVICE @TIME:"+SoS.timeNow+" Agent "+this.name+" Requested "+requestToSP.name+" to serve"+newWI.fullName);
		//myValueManagement.manageValue(this, newWI);
	}		
	public void acceptWI(WorkItemEntity requestedWI) {
		requestedWI.setAssigned(); 
		requestedWI.setAssignedAgent(this);
		//System.out.println("\nACCEPTED WI @TIME:"+SoS.timeNow+" Agent "+this.name+" Accepted WI:"+requestedWI.fullName);
		this.backlogQ.add((Task)requestedWI);		
		//this.requestedQ.remove(requestedWI);
		if (requestedWI.isAnalysisActivity) {
			AggregationNode target = ((AnalysisActivity)requestedWI).AnalysisObject;
			target.getAssignedAgent().complexQ.remove(target);
			target.setAssignedAgent(this);
			this.complexQ.add(target);
		}
	}
	public void releaseSubtasks (AggregationNode aggr) {
		//
		double releasePortion = (double)aggr.currentAnalysisStage/aggr.totalAnalysisStages;
		if (aggr.totalAnalysisStages==0) {
			releasePortion = 1.0;
			aggr.setStarted();
		}
		//
		@SuppressWarnings("unchecked")
		Context<Object> context = ContextUtils.getContext(this);	
		int total = (int) (releasePortion*(double)aggr.getSubtasks().size());
		int count = 0;
		//System.out.println(aggr.getName()+" stage:"+aggr.currentAnalysisStage+"/"+aggr.totalAnalysisStage+" release:"+total+"/"+aggr.getSubtasks().size());
		for (WorkItemEntity subtask: aggr.getSubtasks()) {		
			count++;
			if (!subtask.isActivated) {
				//System.out.println(wi.fullName+" released subtask "+subtask.getName()+"(id:"+subtask.getId()+")");			
				subtask.setActivated();			
				subtask.getUppertasks().add(aggr);
				context.add(subtask);
				SoS.arrivedList.put(subtask.getId(),subtask);
				subtask.setRequester(aggr.getRequester());
				this.requestedQ.add(subtask);			
			}
			else {
				//System.out.println(wi.fullName+"'s subtask"+subtask.fullName+"already activated");	
				if (!subtask.getUppertasks().contains(aggr)) {
					subtask.getUppertasks().add(aggr);
				}	
			}
			if (count>total) {
				break;
			}
		}
	}
	
	public LinkedList<ServiceProviderAgent> findServiceProviders(WorkItemEntity wItem,LinkedList<ServiceProviderAgent> SPs) {
		//int wItem_reqService_id = wItem.serviceId;
		LinkedList<ServiceProviderAgent> list = new LinkedList<ServiceProviderAgent>();
		list.addAll(SPs);
		Service reqService = SoS.myServices.get(wItem.serviceId);
		LinkedList<ServiceProviderAgent> candidates = new LinkedList<ServiceProviderAgent>();
		for (ServiceProviderAgent tAgent: list) {
			double sCapacity = tAgent.ServiceCapacity.get(reqService)+tAgent.ExtendedServiceCapacity.get(reqService);
			if (sCapacity > 0) {
				candidates.add(tAgent);
				//System.out.println(" candidate for "+this.name+" to Assign "+wItem.getName()+" :"+tAgent.name);								
			}
		}
		return candidates;
	}
	public LinkedList<ResourceEntity> findResourceEntities(WorkItemEntity wItem) {
		int wItem_reqService_id = wItem.serviceId;
		LinkedList<ResourceEntity> serviceResourceCandidates = new LinkedList<ResourceEntity>();
		for (ResourceEntity sResource: this.getMyResourceEntities()) {
			if (sResource.isAvailable() && sResource.getEfficiency(wItem_reqService_id)>0) {				
				serviceResourceCandidates.add(sResource);
			}
		}	
		return serviceResourceCandidates;
	}
	
	
	public boolean hasIdleResources() {
		boolean hasIdleResources = false;
		for (int r=0;r<this.getMyResourceEntities().size();r++) {
			ResourceEntity serviceResource = this.getMyResourceEntities().get(r);
			if (!serviceResource.isBusy()) {
				hasIdleResources = true;
				break;
			}
		}
		return hasIdleResources;
	}		
	
	public void statusSummary() {
		this.calculateWorkload();
		this.calculateResourceUtilization();
		//this.countBottleNeck();
//			if (this.activeQ.size()>0) {
//				this.state=1;
//				if (this.resourceUtilization==1.00) {
//				} 
//				}
//			else {
//				this.state=0;
//			}		
	}
	public void calculateWorkload() {
		this.TotalWorkload = 0;
		this.ActiveWorkload = 0;
		for (int i=0;i<this.backlogQ.size();i++) {
			WorkItemEntity workItem = this.backlogQ.get(i);
			this.TotalWorkload += workItem.efforts*(1-workItem.getProgress());
		}
		for (int i=0;i<this.activeQ.size();i++) {
			WorkItemEntity workItem = this.activeQ.get(i);
			this.TotalWorkload += workItem.efforts*(1-workItem.getProgress());
			this.ActiveWorkload += workItem.efforts*(1-workItem.getProgress());
		}
		this.recordTotalWorkload.add(this.TotalWorkload);
		this.recordActiveWorkload.add(this.ActiveWorkload);
	}
	public void calculateResourceUtilization() {
		int numResources = this.getMyResourceEntities().size();
		int numActiveResources = 0;
		for (ResourceEntity serviceResource: this.getMyResourceEntities()) {
			if (serviceResource.isBusy()) {
				numActiveResources += 1;
			}
		}
		this.ResourceUtilization = (double)numActiveResources/(double)numResources;	
		this.recordResourceUtilization.add(this.ResourceUtilization);
	}
	public LinkedList<WorkItemEntity> getRequestedQ()	{
		return this.requestedQ;
	}
	public LinkedList<Task> getBacklogQ()	{
		return this.backlogQ;
	}
	public LinkedList<Task> getActiveQ()	{
		return this.activeQ;
	}
	public LinkedList<WorkItemEntity> getCompleteQ()	{
		return this.completeQ;
	}
	public LinkedList<AggregationNode> getComplexQ()	{
		return this.complexQ;
	}
	public LinkedList<Task> getAssignmentQ()	{
		return this.assignmentQ;
	}
	public int getTotalWICount() {
		int load = this.requestedQ.size()+this.activeQ.size()+this.backlogQ.size();
		return load;
	}
	public double getActiveWorkload() {
		return this.ActiveWorkload;
	}
	public double getTotalWorkload() {
		return this.TotalWorkload;
	}
	public double getResourceUtilization() {
		return this.ResourceUtilization;
	}
	public int checkBottleNeck() {
		int a = this.isBottleNeck;
		this.isBottleNeck = 0;
		return a;
	}		
	public void countBottleNeck() {
		if (this.backlogQ.size()>0 && this.ResourceUtilization<1) {
			for (WorkItemEntity wi : this.backlogQ) {
				if (!wi.precedencyCleared() && this.findResourceEntities(wi).size()>0) {
					this.isBottleNeck = 1;
					this.setBottleNeckCount(this.getBottleNeckCount() + 1);
					//System.out.println(this.name+" is BottleNecked!! (for the "+this.BottleNeckCount+" th time)");						
					break;
				}
			}
		}
	}				
	public void EndRunStatistics() {
		this.TotalWorkLoad_mean = StatMean(recordTotalWorkload);
		this.TotalWorkLoad_stdev = StatStdev(recordTotalWorkload);
		this.ActiveWorkload_mean = StatMean(recordActiveWorkload);
		this.ActiveWorkload_stdev = StatStdev(recordActiveWorkload);
		this.ResourceUtilization_mean = StatMean(recordResourceUtilization);
		this.ResourceUtilization_stdev = StatStdev(recordResourceUtilization);
	}
	public int getBottleneckCount() {
		return this.BottleNeckCount;
	}
	public double getTotalWorkLoad_mean() {
		return this.TotalWorkLoad_mean;
	}
	public double getTotalWorkLoad_stdev() {
		return this.TotalWorkLoad_stdev;
	}
	public double getActiveWorkload_mean() {
		return this.ActiveWorkload_mean;
	}
	public double getActiveWorkload_stdev() {
		return this.ActiveWorkload_stdev;
	}
	public double getResourceUtilization_mean() {
		return this.ResourceUtilization_mean;
	}
	public double getResourceUtilization_stdev() {
		return this.ResourceUtilization_stdev;
	}
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
	public int getBottleNeckCount() {
		return BottleNeckCount;
	}
	public void setBottleNeckCount(int bottleNeckCount) {
		BottleNeckCount = bottleNeckCount;
	}
	public LinkedList<ResourceEntity> getMyResourceEntities() {
		return myResourceEntities;
	}
	public void setMyResourceEntities(LinkedList<ResourceEntity> myResourceEntities) {
		this.myResourceEntities = myResourceEntities;
	}
	
	public int getColorR() {
		return icon.color[0];
	}
	public int getColorG() {
		return icon.color[1];
	}
	public int getColorB() {
		return icon.color[2];
	}
	public int getIconSize() {
		return icon.size;
	}
}
