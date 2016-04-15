package workItems;

public class DevTask extends Task {
	public int maxMaturityLevels = 5;
	public double uncertainty = 1;
	
	public DevTask(WorkItemEntity entity) {
		super(entity);
		this.isDevTask = true;
		this.myWorkItem = entity;
		this.id = entity.getId();
		this.name = entity.getName();
		this.myType = entity.getType();
		this.typeId = entity.getType().getId();
		this.hierarchy = entity.getType().getHierarchy();
		this.initialValue = entity.Value;
		this.Value = initialValue;
		this.currentValue = this.initialValue;
		this.isAggregationNode = entity.isIsAggregationNode();
		this.hasPredecessors = entity.isHasPredecessors();
		this.arrivalTime = entity.arrivalTime;
		this.dueDate = entity.dueDate;
		this.fullName = this.fullName();
		
		this.serviceId = entity.getRequiredServices().get(0).getServiceType().getId();
		this.efforts = entity.getRequiredServices().get(0).getEfforts();
	}
	public DevTask(AggregationNode upperTask, int id, String name, int serviceId, double efforts) {
		super(upperTask);
		this.isDevTask = true;
		this.SoS = upperTask.SoS;
		upperTask.getSubtasks().add(this);
		this.id = id;
		this.name = name;		
		this.typeId = this.SoS.getWorkItemTypeId("DevTask");
		this.myType = SoS.myWorkItemTypes.get(typeId);
		this.hierarchy = this.myType.getHierarchy();		
		this.serviceId = serviceId;
		this.efforts = efforts;
		this.fullName = this.fullName();
	}
	
	public void triggerChanges() {
		int incMaturityLevels = getCurrentMaturityLevel()- getPreviousMaturityLevel();	
		setPreviousMaturityLevel(getPreviousMaturityLevel() + incMaturityLevels);
		//if (incMaturityLevels>0) {System.out.println("@TIME:"+SoS.timeNow+this.fullName+"increased Maturity Level by "+incMaturityLevels+" to "+getCurrentMaturityLevel());}
		for (int i=0; i< incMaturityLevels; i++) {
			// Rework
			if (Math.random()<=SoS.ReworkRisk*this.uncertainty) {
				double reduction = 1/((double)SoS.TaskMaturityLevels);
				this.rework(reduction);	
				this.uncertainty*=(1-SoS.LearningFactor);
			}
			// Call for Resolution
			if (Math.random()<=SoS.TaskUncertainty*this.uncertainty) {
				this.suspendForResolution();
				this.uncertainty*=(1-SoS.LearningFactor);
			}
			// Change Propagation
			this.changePropagation();
			
		}
	}
	public void suspendForResolution() {
		this.isSuspended = true;
		this.setResolutionCount(this.getResolutionCount() + 1);
		this.getAssignedAgent().setBottleNeckCount(this.getAssignedAgent().getBottleNeckCount() + 1);
		this.getAssignedAgent().requestAssistance(this);
		this.isCompleted = false;
		//System.out.println("\nSUSPENDED @TIME:"+this.SoS.timeNow+this.fullName);
	}
	public void changePropagation() {
		for (WorkItemEntity affectedWI : this.getImpactsWIs()) {	
			double likelihood = this.getImpactsLikelihood().get(affectedWI);			
			if (Math.random()<likelihood) {								
				if (!affectedWI.isAggregationNode && affectedWI.isStarted && !affectedWI.isEnded) {	
					double impact = this.getImpactsRisk().get(affectedWI);
					double reduction = impact/((double)SoS.TaskMaturityLevels);
					//System.out.println("\nCHANGE PROPAGATION @TIME:"+this.SoS.timeNow+this.fullName+"propagates rework to"+affectedWI.fullName);
					//System.out.println(likelihood+" "+impact);
					((DevTask) affectedWI).rework(reduction);
					this.setChangePropagationToCount(this.getChangePropagationToCount() + 1);
					affectedWI.setChangePropagationByCount(affectedWI.getChangePropagationByCount() + 1);
					// Learning factor
					this.getImpactsLikelihood().put(affectedWI, likelihood*(1-SoS.LearningFactor));
				}
			}
		}
	}
	public void rework(double progressReduction) {
		if (this.getPreviousReworkTime()<this.SoS.timeNow && this.getProgress()>0) {
			//System.out.println(previousReworkTime+" "+SoS.timeNow);
			this.setPreviousReworkTime(this.SoS.timeNow);
			this.setReworkCount(this.getReworkCount() + 1);
			// Learning Factor
			this.uncertainty *= (1-SoS.LearningFactor); 
			this.setProgress(Math.max((this.getProgress()-progressReduction), 0));								
			//System.out.println("\nREWORK @TIME:"+this.SoS.timeNow+this.fullName+"reworks from "+this.getPreviousProgress()+" to "+this.getProgress()+" (rework count:"+this.getReworkCount()+")");
			if (this.isCompleted) {
				this.isCompleted = false;
				this.completionTime=Integer.MIN_VALUE;
				this.endTime=Integer.MIN_VALUE;
				this.getAssignedAgent().getCompleteQ().remove(this);
				this.getAssignedAgent().getBacklogQ().add(this);
				//System.out.println("Re-Activate"+this.fullName+"at backlog of "+this.assignedAgent.getName());
				for (AggregationNode upperTask : this.getUppertasks()) {
					upperTask.updateCompletionStatus();
				}
			}
			this.setPreviousReworkTime(SoS.timeNow);
		}
	}
}
