package workItems;

public class ResolutionActivity extends Task{
	public DevTask ResolutionObject;
	protected boolean isAggregationNode = false;
	
	public ResolutionActivity(DevTask devTask) {
		super(devTask);
		this.setIsAggregationNode(false);
		this.isResolutionActivity = true;
		this.SoS = devTask.SoS;
		this.ResolutionObject = devTask;
		this.typeId = SoS.getWorkItemTypeId("Resolution");
		this.myType = SoS.myWorkItemTypes.get(typeId);
		this.hierarchy = this.myType.getHierarchy();	
			
		int currentId = this.SoS.getWICount();
		this.id = currentId+1;
		this.SoS.increaseWICount();
		this.name = "Res-"+devTask.getName();
		this.hasPredecessors = false;
		this.value = 0;
		this.initialValue = 0;
		this.currentValue =0;
		
		this.setRequester(ResolutionObject.getRequester());
		this.serviceId = this.getRequester().getMyResourceEntities().get(0).getSkillSet().get(0).getService().getId();
		this.efforts = ResolutionObject.efforts * 0.5;
		this.maxMaturityLevels = 1;
		this.uncertainty = 0;
		this.risk = 0;		
		this.setActivated();
		this.fullName = this.fullName();
		
		devTask.addPredecessorTask(this);
	}

}
