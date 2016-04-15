package workItems;

import java.util.LinkedList;

import bsh.This;
import processModels.ProcessModel;
import serviceProviders.ResourceEntity;
import serviceProviders.ServiceProviderAgent;
import xtext.objectsModel.Skill;
import xtext.objectsModel.WorkItem;

public class AggregationNode extends WorkItemEntity{
	private LinkedList<WorkItemEntity> subtasks = new LinkedList<WorkItemEntity>();
	private LinkedList<AnalysisActivity> analysisTasks = new LinkedList<AnalysisActivity>();
	public AutoGenerateWIN myAutoGenerateWIN = new AutoGenerateWIN();
	public boolean hasProcessModel = false;
	private ProcessModel processModel;
	public int currentProcessStage;
	public int currentAnalysisStage;
	public int totalAnalysisStages=1;
	
	public AggregationNode(WorkItem wi) {
		super(wi);
		this.isAggregationNode = true;		
		this.totalAnalysisStages = wi.getRequiredAnalysis().size();	
	}

	public void updateCompletionStatus() {
		if (this.isAggregationNode && !this.isCompleted) {
			int unfinished = 0;			
			boolean cpl = true;
			for (WorkItemEntity subTask: this.getSubtasks()) {	
				if (!subTask.isCompleted) {
					cpl = false;
					this.isCompleted = false;
					this.completionTime = Integer.MAX_VALUE;
					unfinished++;
				}
			}
			this.setProgress(1-(double)unfinished/(double)this.getSubtasks().size());
			if (cpl == true) {
				this.setCompleted();
				this.updateUpperTasksCompletion();				
			}
		}
	}
	public void updateProcessModelStage() {
		if (this.hasProcessModel) {
			this.processModel.updateStage(this);
		}
	}
	public void setProcessModel(ProcessModel processModel) {
		this.processModel = processModel;
		this.hasProcessModel = true;
	}
	public ProcessModel getProcessModel() {
		return this.processModel;
	}
	public String getProcessModelName() {
		String s;
		if (this.hasProcessModel) {
			s = this.processModel.name;
		}
		else {
			s = "N/A";
		}
		return s;
	}
	public String getProcessStage(int stageNumber) {
		String s;
		if (this.hasProcessModel) {
			s = this.processModel.stages.get(stageNumber).name;
		}
		else {
			s = "N/A";
		}
		return s;
	}
	public String getCurrentProcessStage() {
		return this.getProcessStage(currentProcessStage);
	}
	public void setCurrentProcessStage(int currentProcessStage) {
		this.currentProcessStage = currentProcessStage;
	}
	public LinkedList<WorkItemEntity> getSubtasks() {
		return subtasks;
	}
	public void setSubtasks(LinkedList<WorkItemEntity> subtasks) {
		this.subtasks = subtasks;
	}
//	public void addSubTask(WorkItemEntity subTask) {
//		if (!this.getSubtasks().contains(subTask)) {
//			this.getSubtasks().add(subTask);
//			subTask.addUpperTask(this);
//		}
//	}
//	public void removeSubTask(WorkItemEntity subTask) {
//		if (this.getSubtasks().contains(subTask)) {
//			this.getSubtasks().remove(subTask);
//			subTask.removeUpperTask(this);
//		}
//	}
	public double getProgress() {
		double progress = 0;
		for (WorkItemEntity subtask:this.getSubtasks()) {
			progress += subtask.getProgress();
		}
		progress = progress/this.getSubtasks().size();
		this.setProgress(progress);
		return progress;
	}
	public double getProgressRate() {
		double progressRate = 0;
		for (WorkItemEntity subtask:this.getSubtasks()) {
			progressRate += subtask.getProgressRate();
		}
		progressRate = progressRate/this.getSubtasks().size();
		this.setProgressRate(progressRate);
		return progressRate;
	}
	public double calculateExtendedServiceCapacity(ServiceProviderAgent sp) {
		double sEfficiency = 0;
		sEfficiency += sp.ExtendedServiceCapacity.get(SoS.myServices.get(this.serviceId));
		return sEfficiency;
	}
	public double calculateServiceCapacity(ServiceProviderAgent sp) {
		double sEfficiency = 0;
		sEfficiency = sp.ServiceCapacity.get(SoS.myServices.get(this.serviceId));
		return sEfficiency;
	}
}
