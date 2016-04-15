package serviceProviders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import datasemSimulator.AbstractClass;
import repast.simphony.random.RandomHelper;
import workItems.AggregationNode;
import workItems.AnalysisActivity;
import workItems.ResolutionActivity;
import workItems.DevTask;
import workItems.Task;
import workItems.WorkItemEntity;

public class AbstractAgentBehavior {	
	public HashMap<Integer,String> StepsMap;
	public HashMap<Integer,String> ActionsMap;
	public ServiceProviderAgent agent;		
	public int WIPLimit = Integer.MAX_VALUE;
	public int BacklogLimit = Integer.MAX_VALUE;
	public int MultiTasking = 1;
	private int clock;
	private boolean sprintNow;
	
	public AbstractAgentBehavior() {
		this.StepsMap = new HashMap<Integer,String>();
		addStep(1, "CheckRequestedQ");
		addStep(2, "MakeAssignments");
		addStep(3, "SelectWIsToStart");
		addStep(4, "AdvanceWIsProgress");
		addStep(5, "TriggerWIsChanges");
		addStep(6, "CheckWIsCompletion");
		addStep(7, "CheckAggregationNodesCompletion");
		addStep(8, "DisburseWIs");
		addStep(9, "EndState");
	}
	public void GoToStep(int n) {
		if (StepsMap.containsKey(n)) {
			//System.out.println(agent.getName()+" step code: "+n+" step "+StepsMap.get(n));
			switch(StepsMap.get(n)) {		
				case "CheckRequestedQ": CheckRequestedQ(); break;
				case "MakeAssignments": MakeAssignments(); break;
				case "SelectWIsToStart": SelectWIsToStart(); break;
				case "AdvanceWIsProgress": AdvanceWIsProgress();  break;
				case "TriggerWIsChanges": TriggerWIsChanges(); break;
				case "CheckWIsCompletion": CheckWIsCompletion(); break;
				case "CheckAggregationNodesCompletion": CheckAggregationNodesCompletion(); break;
				case "DisburseWIs": DisburseWIs(); break;
				case "EndState": EndState(); break;
			}
		}
	}
//	public void DoAction(int n, AbstractClass Object) {
//		switch(ActionsMap.get(n)) {
//			case "requestAssistance": 
//				if(Object.getClass().equals("WorkItemEntity")){
//					DevTask devTask = (DevTask)ObjectToWorkItemEntity(Object);
//					agent.requestAssistance(devTask);
//				}
//			case "acceptanceDecision": 
//				if(Object.getClass().equals("WorkItemEntity")){
//					WorkItemEntity wi = ObjectToWorkItemEntity(Object);
//					this.acceptanceDecision((Task)wi);
//				}
//			case "analyzeAggregationNode": Action(Object);
//			case "requestService": Action(Object);
//			case "acceptWI": Action(Object);
//			case "releaseSubtasks": Action(Object);
//		}
//	}
//	public boolean CheckCondition(String condition) {	
//		return false;
//	}
//
//	public void DoAction(int n) {
//		switch(ActionsMap.get(n)) {
//		}
//	}
//	public WorkItemEntity ObjectToWorkItemEntity(AbstractClass Object) {
//		WorkItemEntity wi = agent.SoS.myWorkItemEntities.get(0);
//		return wi;
//	}
//	public void Action() {
//		
//	}
//	public void Action(AbstractClass Object) {
//		
//	}
	public void CheckRequestedQ() {
		clock++;
		setSprintNow(false);
		if (clock==agent.myStrategy.Cadence || agent.getRequestedQ().isEmpty()
				|| (agent.getBacklogQ().isEmpty()&&agent.getActiveQ().isEmpty())) {
			clock=0;
			setSprintNow(true);
		}
		// ------------ 1. Select WIs to Accept
		LinkedList<Task> requestedTasks = new LinkedList<Task>();
		for (int i=0;i<agent.getRequestedQ().size();i++) {
			WorkItemEntity wi = agent.getRequestedQ().get(i);
			if (isSprintNow() || agent.getId()==wi.getRequester().getId()) {
				if (wi.isAggregationNode) {
					wi.setAssigned();
					wi.setAssignedAgent(agent);
					agent.getComplexQ().add((AggregationNode)wi);
					agent.analyzeAggregationNode((AggregationNode)wi);
					agent.getRequestedQ().remove(wi);
					i--;
				}
				else {
					requestedTasks.add((Task)wi);
					agent.getRequestedQ().remove(wi);
					i--;
				}
			}
		}
		agent.myStrategy.applyWorkPrioritization(agent, requestedTasks);
		while (!requestedTasks.isEmpty()) {
			// =========== Apply WI Acceptance Rule ====================
			Task task = requestedTasks.getFirst();
			// =========== Service Efficiency Algorithm ==============
			String decision = this.acceptanceDecision(task);
			//System.out.println("\n"+agent.getName()+" on"+task.fullName+"requested by "+task.getRequester().getName()+"("+task.SoS.myServices.get(task.serviceId).getName()+"x"+task.efforts+") Decision: "+decision);
			if (decision.matches("Accept")) {			
				//System.out.println(agent.getName()+" accepts"+wi.fullName);
				task.currentDecision = 1;
				agent.acceptWI(task);
			}
			else if (decision.matches("Outsource")) {
				//System.out.println(agent.getName()+" decides to outsource"+wi.fullName);
				task.currentDecision = 2;
				agent.getAssignmentQ().add(task);
			}
			else if (decision.matches("RequestHelp")) {
				if (agent.getId()==agent.SoS.coordinator.getId()) {
					//System.out.println(agent.getName()+" handles"+wi.fullName);
					task.currentDecision = 2;
					agent.getAssignmentQ().add(task);
				}
				else {
					//System.out.println(agent.getName()+" requests help from "+agent.SoS.coordinator.getName()+" on"+wi.fullName);
					task.currentDecision = 3;
					agent.requestService(task, agent.SoS.coordinator);
					if (task.isAnalysisActivity) {
						AggregationNode aggr = ((AnalysisActivity)task).AnalysisObject;
						agent.SoS.coordinator.getComplexQ().add(aggr);
						agent.getComplexQ().remove(aggr);
					}
				}
			}
			else if (decision.matches("Decline")) {
				//System.out.println(agent.getName()+" declines"+wi.fullName+"from "+wi.getRequester().getName());
				if (task.getRequester().getId()==agent.getId()) {
					String msg = "ERROR: "+agent.getName()+" declines"+task.fullName+" which is requested by itself!";
					JOptionPane.showMessageDialog(null,msg);
					throw new RuntimeException(msg);
				}
				else {
					task.currentDecision = 4;
					task.getRequester().getRequestedQ().add(task);
				}
			}
			else {
				String msg = "ERROR: "+" invalid decision --"+decision+"--!";
				JOptionPane.showMessageDialog(null,msg);
				throw new RuntimeException(msg);
			}
			requestedTasks.remove(task);
			agent.getRequestedQ().remove(task);
		}
	}

	public void MakeAssignments() {
		LinkedList<ServiceProviderAgent> candidates = agent.assignWITo;
		HashMap<Task,ServiceProviderAgent> schedule = 
				agent.myStrategy.applyAgentSelection(agent, agent.getAssignmentQ(), candidates);
		for (WorkItemEntity wi: schedule.keySet()) {
			ServiceProviderAgent selectedSP = schedule.get(wi);
			agent.requestService(wi, selectedSP);
			agent.getAssignmentQ().remove(wi);
			//System.out.println(agent.getName()+" assigned"+wi.fullName+"to "+selectedSP.getName());			
			agent.NowRequested.add(selectedSP);
			//selectedSP.checkRequestedQ();
		}
		agent.getRequestedQ().addAll(agent.getAssignmentQ());
		agent.getAssignmentQ().clear();
		agent.NowRequested.clear();
	}
	public void SelectWIsToStart() {
		LinkedList<Task> readyQ = new LinkedList<Task>();
		readyQ.addAll(agent.getBacklogQ());
		agent.myStrategy.applyWorkPrioritization(agent, readyQ);
		for (int i=0;i<readyQ.size();i++) {			
			Task wi = readyQ.get(i);	
			if (!wi.precedencyCleared()) {
				readyQ.remove(wi);
				i--;
				//System.out.println(agent.getName()+": Cannot Start"+wi.fullName+"due to Precedency");
			}
			else if (this.taskCompletionHandling(wi)) {
				readyQ.remove(wi);
				//System.out.println(agent.getName()+": found"+wi.fullName+"already Completed");
				i--;
			}
		}
		HashMap<Task,ResourceEntity> schedule = agent.myStrategy.applyResourceAllocation(agent, readyQ);
		for (Task wi: schedule.keySet()) {
			ResourceEntity selectedR = schedule.get(wi);
			selectedR.allocateTo(wi);
			wi.setStarted();
			agent.getActiveQ().add(wi);
			agent.getBacklogQ().remove(wi);
		}
	}
	
	public void AdvanceWIsProgress() {
		for(int i=0;i<agent.getActiveQ().size();i++) {
			Task WI = agent.getActiveQ().get(i);
			WI.advanceProgress();
		}
	}
	
	public void TriggerWIsChanges() {
		//System.out.println("Agent "+this.name+" checkWIsCompletion");
		for(int i=0;i<agent.getActiveQ().size();i++) {
			Task task = agent.getActiveQ().get(i);
			if (task.isDevTask) {
				((DevTask)task).triggerChanges();
			}
		}
	}
	
	public void CheckWIsCompletion() {
		//System.out.println("Agent "+this.name+" checkWIsCompletion");
		for(int i=0;i<agent.getActiveQ().size();i++) {
			Task wi = agent.getActiveQ().get(i);
			if ( this.taskCompletionHandling(wi) ){
				i--;
			}
		}
	}		
	
	public void CheckAggregationNodesCompletion() {
		for(int i=0;i<agent.getComplexQ().size();i++) {
			AggregationNode aggrWI = agent.getComplexQ().get(i);
			aggrWI.updateUpperTasksCompletion();
			aggrWI.updateProcessModelStage();
			if (aggrWI.isCompleted) {
				agent.getComplexQ().remove(aggrWI);
				agent.getCompleteQ().add(aggrWI);
				i--;
			}
		}			
	}		
	public void DisburseWIs() {			
		for (int i=0;i<agent.getCompleteQ().size();i++) {
			WorkItemEntity wi=agent.getCompleteQ().get(i);				
			//System.out.println("\nDISBURSE @TIME:"+agent.SoS.timeNow+" Agent "+agent.getName()+" try to disburse"+wi.fullName+"...");
			if (wi.getProgress() <= 0.9999) {
				//System.out.println("Progress Not Satisfied");
				wi.isCompleted = false;
				agent.getCompleteQ().remove(wi);	
				if (wi.isAggregationNode) {
					agent.getComplexQ().add((AggregationNode)wi);
				}
				else {
					agent.getBacklogQ().add((Task)wi);
				}				
				i--;
			}
			//else {
			else if (wi.uppertasksCleared()) {
				//System.out.println("\nDISBURSE @TIME:"+SoS.timeNow+" Agent "+this.name+" disbursed"+completedWI.fullName);
				wi.setEnded();	
				agent.getCompleteQ().remove(wi);					
				i--;			
			}
		}
	}
	public void EndState() {					
		agent.statusSummary();
	}

	public String acceptanceDecision(Task requestedWI) {
		String decision;		
		if (requestedWI.isResolutionActivity) {
			double capacity = requestedWI.calculateServiceCapacity(agent);	
			if (capacity>0) {
				decision = "Accept";
			}
			else {
				double exCapacity = requestedWI.calculateExtendedServiceCapacity(agent);	
				if (exCapacity>0) {
					decision = "Outsource";
				}
				else {
					decision = "RequestHelp";
				}
			}
		}
		else {
			if (requestedWI.getRequester().getId() == agent.getId()) {
				double capacity = requestedWI.calculateServiceCapacity(agent);
				if (capacity>0) {
					if (agent.getBacklogQ().size()>=this.BacklogLimit) {
						decision = "Outsource";
					}
					else {
						decision = "Accept";
					}
					//System.out.println("\nDELINED WI @TIME:"+SoS.timeNow+" Agent "+this.name+" Declined WI:"+requestedWI.fullName+"due to Inability");
				}
				else {
					double exCapacity = requestedWI.calculateExtendedServiceCapacity(agent);	
					if (exCapacity>0) {
						decision = "Outsource";
					}
					else {
						decision = "RequestHelp";
					}
				}
			}
			else if (agent.getBacklogQ().size()>=this.BacklogLimit) {
				decision = "Decline";
				//System.out.println("\nDELINED WI @TIME:"+SoS.timeNow+" Agent "+this.name+" Declined WI:"+requestedWI.fullName+"due to BacklogLimit");		
			}
			else {
				double capacity = requestedWI.calculateServiceCapacity(agent);
				if (capacity>0) {
					decision = "Accept";
					//System.out.println("\nDELINED WI @TIME:"+SoS.timeNow+" Agent "+this.name+" Declined WI:"+requestedWI.fullName+"due to Inability");
				}
				else {
					double exCapacity = requestedWI.calculateExtendedServiceCapacity(agent);	
					if (exCapacity>0) {
						decision = "Outsource";
					}
					else {
						decision = "Decline";
					}
				}
			}
		}
		return decision;
	}	
	
	public boolean taskCompletionHandling(Task WI) {
		boolean completion = false;
		if ( (WI.getProgress()>0.9999) && (!WI.isSuspended) ){			
			if (WI.isAnalysisActivity) {
				//System.out.println("\nCOMPLETED ANALYSIS @TIME:"+SoS.timeNow+" Agent "+this.name+" completed analyzing"+WI.AnalysisObject.fullName);
				AggregationNode analysisObject = (AggregationNode)((AnalysisActivity)WI).AnalysisObject;		
				analysisObject.currentAnalysisStage ++;
				//System.out.println(analysisObject.currentAnalysisStage+" "+analysisObject.totalAnalysisStage);
				if (analysisObject.currentAnalysisStage == analysisObject.totalAnalysisStages) {				
					agent.releaseSubtasks(analysisObject);			
					analysisObject.myValueFunction.developValue(analysisObject);
				}
				else {
					agent.releaseSubtasks(analysisObject);
					analysisObject.myValueFunction.developValue(analysisObject);
					analysisObject.serviceId = analysisObject.myWorkItem.getRequiredAnalysis().get(analysisObject.currentAnalysisStage).getServiceType().getId();
					analysisObject.efforts = analysisObject.myWorkItem.getRequiredAnalysis().get(analysisObject.currentAnalysisStage).getEfforts();
					agent.getRequestedQ().add(analysisObject);
					agent.getComplexQ().remove(analysisObject);
				}
			}
			else if (WI.isResolutionActivity) {
				Task suspendedTask = (Task) ((ResolutionActivity)WI).ResolutionObject;
				suspendedTask.isSuspended = false;
				suspendedTask.getPredecessors().remove(WI);
				taskCompletionHandling(suspendedTask);
				//System.out.println("\nSUSPENSION CLEARED @TIME:"+agent.SoS.timeNow+suspendedTask.fullName);
			}
			agent.getBacklogQ().remove(WI);
			agent.getActiveQ().remove(WI);
			agent.getCompleteQ().add(WI);
			completion = true;
			WI.setCompleted();
			WI.withdrawAllResources();
		}
		return completion;
	}	
	
	public void setAgent(ServiceProviderAgent agent) {
		this.agent = agent;
		this.agent.myStrategy.applyWorkAcceptance(agent);
	}
	public void addStep(int key,String state) {
		this.StepsMap.put(key, state);
	}
	public void addAction(int key,String action) {
		this.ActionsMap.put(key, action);
	}
	public boolean isSprintNow() {
		return sprintNow;
	}
	public void setSprintNow(boolean sprintNow) {
		this.sprintNow = sprintNow;
	}
}
