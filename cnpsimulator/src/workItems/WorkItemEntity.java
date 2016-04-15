package workItems;

import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import processModels.ValueFunction;
import datasemSimulator.SystemOfSystems;
import bsh.This;
import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ISchedule;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.random.RandomHelper;
import repast.simphony.util.ContextUtils;
import serviceProviders.ResourceEntity;
import serviceProviders.ServiceProviderAgent;
import visualization.Icon;
import xtext.objectsModel.RequiredService;
import xtext.objectsModel.Service;
import xtext.objectsModel.Skill;
import xtext.objectsModel.WorkItem;
import xtext.objectsModel.WorkItemType;
import xtext.objectsModel.impl.WorkItemImpl;


public class WorkItemEntity extends WorkItemImpl {
	public SystemOfSystems SoS;
	// Static Attributes
	public WorkItem myWorkItem;
	public String fullName;
	public WorkItemType myType;
	public int typeId;
	public int hierarchy = 0;
	//
	public double efforts = 0;
	public int serviceId;
	public double initialValue;
	//
	public boolean isAggregationNode = false;
	public boolean isDevTask = false;
	public boolean isAnalysisActivity = false;
	public boolean isResolutionActivity = false;
	private LinkedList<WorkItemEntity> predecessors = new LinkedList<WorkItemEntity>();
	private LinkedList<WorkItemEntity> successors = new LinkedList<WorkItemEntity>();
	private LinkedList<AggregationNode> uppertasks = new LinkedList<AggregationNode>();
	private LinkedList<WorkItemEntity> impactsWIs = new LinkedList<WorkItemEntity>();
	private HashMap<WorkItemEntity,Double> impactsLikelihood = new HashMap<WorkItemEntity,Double>();
	private HashMap<WorkItemEntity,Double> impactsRisk = new HashMap<WorkItemEntity,Double>();
	
	public int maxMaturityLevels = 1;
	public double uncertainty = 0;
	public double risk = 0;
	public ValueFunction myValueFunction = new ValueFunction();
	// Visualization
	public Icon icon = new Icon();	
	// Dynamic Attributes
	public boolean isActivated=false;
	public boolean isAssigned=false;
	public boolean isStarted=false;
	public boolean isSuspended=false;
	public boolean isRestarted=false;
	public boolean isCompleted=false;
	public boolean isEnded=false;
	public double currentValue;
	public double Value;
	
	public int arrivalTime = Integer.MAX_VALUE;
	public double estimatedEfforts=Double.MAX_VALUE;
	public double estimatedCompletionTime=Double.MAX_VALUE;
	public int activatedTime=Integer.MAX_VALUE;	
	public int startTime=Integer.MAX_VALUE;
	public int assignedTime=Integer.MAX_VALUE;
	public int completionTime=Integer.MAX_VALUE;
	public int endTime=Integer.MAX_VALUE;
	public int leadTime=Integer.MAX_VALUE;
	public int cycleTime=Integer.MAX_VALUE;
	public int dueDate=Integer.MAX_VALUE;
		
	private ServiceProviderAgent requester;
	private ServiceProviderAgent assignedAgent;
	private LinkedList<ResourceEntity> allocatedResources = new LinkedList<ResourceEntity>();
	
	private double serviceEfficiency = 0;
	private double progress= 0;
	private double previousProgress = 0;
	private double progressRate= 0;
	private double perceivedValue= 0;
	
	private int currentMaturityLevel = 0;
	private int ReworkCount = 0;
	private int ResolutionCount = 0;
	private int ChangePropagationToCount = 0;
	private int ChangePropagationByCount = 0;
	private double previousReworkTime = 0;
	private int previousMaturityLevel = 0;
	private double CycleTimeToEffortsRatio = 0;
	private boolean hasDelivered;
	
	public WorkItemEntity (WorkItem wi) {
		this.myWorkItem = wi;
		this.id = wi.getId();
		this.name = wi.getName();
		this.myType = wi.getType();
		this.typeId = wi.getType().getId();
		this.hierarchy = wi.getType().getHierarchy();
		this.initialValue = wi.getValue();
		this.Value = initialValue;
		this.currentValue = this.initialValue;
		this.isAggregationNode = wi.isIsAggregationNode();
		this.hasPredecessors = wi.isHasPredecessors();
		this.arrivalTime = wi.getArrivalTime();
		this.fullName = this.fullName();
	}
	public WorkItemEntity (WorkItemEntity WorkItemEntity) {
		
	}
	public void addToContext() {
		if (this.isActivated) {
			//-
			@SuppressWarnings("unchecked")
			Context<Object> context = ContextUtils.getContext(this);	
			//-
			context.add(this);
		}
	}
	public void removeFromContext() {
		if (this.isEnded) {
			//-
			@SuppressWarnings("unchecked")
			Context<Object> context = ContextUtils.getContext(this);	
			//-
			context.remove(this);
		}
	}
	
	public void updateUpperTasksCompletion() {
		if (this.isCompleted) {
			for (AggregationNode upperTask:this.getUppertasks()) {
				if (upperTask.isActivated && !upperTask.isCompleted) {
					upperTask.updateCompletionStatus();
				}
			}
		}	
	}	
//	public void addUpperTask(AggregationNode upperTask) {
//		if (!this.getUppertasks().contains(upperTask)){
//			this.getUppertasks().add(upperTask);
//			upperTask.addSubTask(this);
//		}
//	}
//	
//	public void removeUpperTask(AggregationNode upperTask) {
//		if (this.getUppertasks().contains(upperTask)) {
//			this.getUppertasks().remove(upperTask);
//			upperTask.removeSubTask(this);
//		}
//	}	
	public int countIncompletedPredecessors() {
		int count = 0;
		for (WorkItemEntity predecessor:this.getPredecessors()) {
			if (!predecessor.isCompleted) {
				count ++;
			}
		}
		return count;
	}	
	public void addPredecessorTask(WorkItemEntity predecessor) {
		if (!this.getPredecessors().contains(predecessor)) {
			this.getPredecessors().add(predecessor);
			this.getSuccessors().add(this);
		}
	}
	public void addSuccessorTask(WorkItemEntity successor) {
		if (!this.getSuccessors().contains(successor)) {
			this.getSuccessors().add(successor);
			this.getPredecessors().add(this);
		}
	}
	public boolean uppertasksCleared() {
		boolean cleared = true;
		for (WorkItemEntity upperTask:this.getUppertasks()) {
			if (upperTask.isActivated && !upperTask.isCompleted) {
				cleared = false;
				//System.out.println(this.fullName+"uppertask"+upperTask.fullName+"not cleared");
				break;
			}
//			else if (upperTask.isActivated && upperTask.isCompleted) {
//				cleared = upperTask.uppertasksCleared();
//				if (!cleared) {
//					break;
//				}
//			}
		}
		return cleared;
	}

	public boolean precedencyCleared() {
		boolean cleared = true;
		for (int i=0;i<this.getPredecessors().size();i++) {
			WorkItemEntity pTask = this.getPredecessors().get(i);
			if (pTask.isCompleted) {
			}
			else {
				cleared = false;
				//System.out.println(this.fullName+"predecessor"+pTask.fullName+"not cleared");
				break;
			}
		}
		return cleared;				
	}	
	
	public void removeFromSuccessorTasks() {
		for (WorkItemEntity sTask:this.getSuccessors()) {
			sTask.getPredecessors().remove(this);
		}
	}	
	/*
	public void triggerCausalities() {
		if (this.isAssigned&&this.precedencyCleared()){
			if (this.isAggregationNode) {
				for (WorkItemEntity subtask:subtasks) {
					subtask.assignedAgent = this.assignedAgent;
				}
			}
//			for (int c=0;c<this.getKSSTriggers().size();c++) {
//				KSSTrigger trigger = this.getKSSTriggers().get(c);
//				if ((this.isCompleted())||(this.progress >= trigger.getAtProgress())) {
//					double rand = Math.random();
//					if (trigger.getOnProbability() >= rand) {
//						for (int t=0;t<trigger.getTriggered().size();t++) {
//							KSSTask triggeredWI = trigger.getTriggered().get(t);
//							if (!trigger.isRepetitive() && !triggeredWI.isCreated()){
//								context.add(triggeredWI);
//								if (triggeredWI.getCOS().matches("Important")) {
//									this.getUpperTasks().get(0).addSubTask(triggeredWI);
//								}	
//								//
//								this.SoS.getArrivedList().add(triggeredWI);
//								triggeredWI.setCreated();
//								triggeredWI.setArrivalTime(this.SoS.timeNow);
//								// Put triggered WI to requestedQ of main WI's SP								
//								this.getAssignedTo().assignWI(triggeredWI);										
//							}
//						}
//					}
//					if (!trigger.isRepetitive()) {
//						this.getKSSTriggers().remove(trigger);
//					}
//				}
//			}
		}
	}
	*/
	public String fullName(){
		String full_name = " "+this.myType.getName()+"[Hierarchy:"+this.hierarchy+"]"+this.getName()+"(id:"+this.getId()+") ";
		return full_name;
	}
	public void setSuspended() {
		this.isSuspended = true;				
	}
	public void setActivated() {
		this.isActivated= true;
		if (this.activatedTime>=Integer.MAX_VALUE-1) {
			this.activatedTime = this.SoS.timeNow;
		}
		else {
			this.activatedTime = Math.max(this.SoS.timeNow, this.activatedTime);
		}
		//System.out.println("WorkItem "+this.getName()+"(id:"+this.getId()+")"+" is activated");
	}
	public void setStarted() {	
		this.isStarted= true;
		this.startTime = this.SoS.timeNow;
	}
	public void setCompleted() {
		this.isCompleted=true;		
		this.completionTime=this.SoS.timeNow;
		//System.out.println("\nCOMPLETION @TIME:"+this.SoS.timeNow+this.fullName+"is Completed");
		this.updateUpperTasksCompletion();
	}
	public void setEnded() {
		if (this.hasDelivered) {
			//System.out.println(this.fullName+"has already delivered!");
		}
		else {
			this.SoS.deliverValue(this.currentValue);
			this.hasDelivered = true;
			//System.out.println("\nDELIVERY @TIME:"+this.SoS.timeNow+this.fullName+", delivered "+this.currentValue+" stakeholder value");
		}
		this.isEnded=true;
		this.endTime = this.SoS.timeNow;
		this.leadTime = this.endTime - this.activatedTime + 1;
		if (this.isAggregationNode) {
			this.cycleTime = this.leadTime;
		}
		this.removeFromSuccessorTasks();
		
		this.CycleTimeToEffortsRatio = this.efforts/this.cycleTime;
		
		if (this.isResolutionActivity||this.isAnalysisActivity) {
			this.removeFromContext();
			this.SoS.arrivedList.remove(this.getId());
		}
		else if (this.SoS.initialList.containsKey(this.getId())) {
			this.SoS.initialList.remove(this.getId());
			this.SoS.endedList.add(this);
			//System.out.println("\nEND WI @TIME:"+this.SoS.timeNow+this.fullName+"is Ended."+" StartTime:"+this.startTime+" CompletionTime:"+this.completionTime+" CycleTime:"+this.cycleTime+" LeadTime:"+this.leadTime+" ReworkCount:"+this.ReworkCount);
			//System.out.println("\nDELIVERY @TIME:"+this.SoS.timeNow+this.fullName+", delivered "+this.currentValue+" stakeholder value");
		}
		else {		
			this.SoS.endedList.add(this);		
		}
	}
	public void setAssigned() {
		this.isAssigned=true;		
		this.assignedTime = this.SoS.timeNow;
	}
	public void setCreated() {
		this.isActivated=true;
		this.activatedTime=this.SoS.timeNow;
		//System.out.println(this.getName()+"(id:"+this.getId()+") is Created");
	}

	public double getPerceivedValue() {
		return this.perceivedValue;
	}
	public void setPerceivedValue(double v) {
		this.perceivedValue = v;
	}
	public WorkItemType getType() {
		return this.myWorkItem.getType();
	}
	public EList<RequiredService> getRequiredServices() {
		return this.myWorkItem.getRequiredServices();
	}
	public int getTypeId() {
		return this.typeId;
	}
	public int getHierarchy() {
		return this.hierarchy;
	}
	public double getEfforts() {
		return this.efforts;
	}
	public double getActivatedTime() {
		return this.activatedTime;
	}
	public double getStartTime() {
		return this.startTime;
	}
	public double getAssignedTime() {
		return this.assignedTime;
	}
	public double getCompletionTime() {
		return this.completionTime;
	}
	public double getEndTime() {
		return this.endTime;
	}
	public double getLeadTime() {
		return this.leadTime;
	}
	public double getCycleTime() {
		return this.cycleTime;
	}
	public int getReworkCount() {
		return this.ReworkCount;
	}
	public int getChangePropagationByCount() {
		return this.ChangePropagationByCount;
	}
	public int getChangePropagationToCount() {
		return this.ChangePropagationToCount;
	}
	public double getCycleTimeToEffortsRatio() {
		return this.CycleTimeToEffortsRatio;
	}
	public double getServiceEfficiency() {
		return serviceEfficiency;
	}
	public void setServiceEfficiency(double serviceEfficiency) {
		this.serviceEfficiency = serviceEfficiency;
	}
	public double getInitialValue() {
		return initialValue;
	}
	public double getProgress() {
		return progress;
	}
	public void setProgress(double progress) {
		this.progress = progress;
	}
	public double getProgressRate() {
		return progressRate;
	}
	public void setProgressRate(double progressRate) {
		this.progressRate=progressRate;
	}
	public LinkedList<ResourceEntity> getAllocatedResources() {
		return allocatedResources;
	}
	public void setAllocatedResources(LinkedList<ResourceEntity> allocatedResources) {
		this.allocatedResources = allocatedResources;
	}
	public ServiceProviderAgent getRequester() {
		return requester;
	}
	public void setRequester(ServiceProviderAgent requester) {
		this.requester = requester;
	}
	public ServiceProviderAgent getAssignedAgent() {
		return assignedAgent;
	}
	public void setAssignedAgent(ServiceProviderAgent assignedAgent) {
		this.assignedAgent = assignedAgent;
	}
	public LinkedList<AggregationNode> getUppertasks() {
		return uppertasks;
	}
	public void setUppertasks(LinkedList<AggregationNode> uppertasks) {
		this.uppertasks = uppertasks;
	}
	public LinkedList<WorkItemEntity> getSuccessors() {
		return successors;
	}
	public void setSuccessors(LinkedList<WorkItemEntity> successors) {
		this.successors = successors;
	}
	public LinkedList<WorkItemEntity> getPredecessors() {
		return predecessors;
	}
	public void setPredecessors(LinkedList<WorkItemEntity> predecessors) {
		this.predecessors = predecessors;
	}
	public LinkedList<WorkItemEntity> getImpactsWIs() {
		return impactsWIs;
	}
	public void setImpactsWIs(LinkedList<WorkItemEntity> impactsWIs) {
		this.impactsWIs = impactsWIs;
	}
	public HashMap<WorkItemEntity,Double> getImpactsRisk() {
		return impactsRisk;
	}
	public void setImpactsRisk(HashMap<WorkItemEntity,Double> risk) {
		this.impactsRisk = risk;
	}
	public HashMap<WorkItemEntity,Double> getImpactsLikelihood() {
		return impactsLikelihood;
	}
	public void setImpactsLikelihood(HashMap<WorkItemEntity,Double> impactsLikelihood) {
		this.impactsLikelihood = impactsLikelihood;
	}
	public void setReworkCount(int reworkCount) {
		ReworkCount = reworkCount;
	}
	public void setChangePropagationByCount(int changePropagationByCount) {
		ChangePropagationByCount = changePropagationByCount;
	}
	public int getCurrentMaturityLevel() {
		return currentMaturityLevel;
	}
	public void setCurrentMaturityLevel(int currentMaturityLevel) {
		this.currentMaturityLevel = currentMaturityLevel;
	}
	public int getPreviousMaturityLevel() {
		return previousMaturityLevel;
	}
	public void setPreviousMaturityLevel(int previousMaturityLevel) {
		this.previousMaturityLevel = previousMaturityLevel;
	}
	public void setChangePropagationToCount(int changePropagationToCount) {
		ChangePropagationToCount = changePropagationToCount;
	}
	public double getPreviousReworkTime() {
		return previousReworkTime;
	}
	public void setPreviousReworkTime(double previousReworkTime) {
		this.previousReworkTime = previousReworkTime;
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
	public double getIconSize() {
		return icon.size;
	}
	public double getPreviousProgress() {
		return previousProgress;
	}
	public void setPreviousProgress(double previousProgress) {
		this.previousProgress = previousProgress;
	}
	public int getResolutionCount() {
		return ResolutionCount;
	}
	public void setResolutionCount(int resolutionCount) {
		ResolutionCount = resolutionCount;
	}
}
