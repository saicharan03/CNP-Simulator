package contractNetProtocol;
import java.util.HashMap;
import java.util.LinkedList;

import datasemSimulator.AbstractClass;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.random.RandomHelper;
import repast.simphony.util.ContextUtils;
import repast.simphony.context.Context;
import serviceProviders.AbstractAgentBehavior;
import serviceProviders.ServiceProviderAgent;
import workItems.AggregationNode;
import workItems.AnalysisActivity;
import workItems.DevTask;
import workItems.Task;
import workItems.WorkItemEntity;
import xtext.objectsModel.ServiceProvider;


public class CNPBehavior extends AbstractAgentBehavior{
	public LinkedList<PurposalCall> myPurposalCalls = new LinkedList<PurposalCall>();
	public LinkedList<Contract> myJiaFangContracts = new LinkedList<Contract>();
	public LinkedList<Bid> receivedBids = new LinkedList<Bid>();
	public LinkedList<PurposalCall> receivedPurposalCalls = new LinkedList<PurposalCall>();
	public LinkedList<Contract> myYiFangContracts = new LinkedList<Contract>();
	
	public CNPBehavior() {
		super();
		this.StepsMap = new HashMap<Integer,String>();
		addStep(1, "CheckRequestedQ");
		addStep(2, "TasksAnnouncement");		
		addStep(3, "Bidding");		
		addStep(4, "BiddersSelection");
		addStep(5, "SelectWIsToStart");
		addStep(6, "AdvanceWIsProgress");
		addStep(7, "TriggerWIsChanges");
		addStep(8, "CheckWIsCompletion");
		addStep(9, "CheckAggregationNodesCompletion");
		addStep(10, "DisburseWIs");
		addStep(11, "EndState");
	}

	public void GoToStep(int n) {
		if (StepsMap.containsKey(n)) {
			switch(StepsMap.get(n)) {		
			case "CheckRequestedQ": CheckRequestedQ(); break;		
			case "TasksAnnouncement": TasksAnnouncement(); break;
			case "Bidding": Bidding(); break;
			case "BiddersSelection": BiddersSelection(); break;
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

	public void TasksAnnouncement() {
		for (int i=0;i<agent.getAssignmentQ().size();i++) {
			Task task = agent.getAssignmentQ().get(i);
			if (!agent.findServiceProviders(task, agent.assignWITo).isEmpty()) {
				this.callForPurposal(task, agent.assignWITo);				
			}
			else {
				agent.getRequestedQ().add(task);
			}
			agent.getAssignmentQ().remove(task);
			i--;
		}		
	}	
	public void Bidding() {
		int count = 0;	
		int space = Math.max(0, 2*(this.BacklogLimit-agent.getBacklogQ().size()));
		if (this.isSprintNow()) {		
			for (int i=0;i<this.receivedPurposalCalls.size();i++) {
				PurposalCall receivedCall = this.receivedPurposalCalls.get(i);
				if (receivedCall.isEnded) {
					this.receivedPurposalCalls.remove(receivedCall);
					i--;
				}
				else {
					// Bidding Logic	
					Task task = receivedCall.target;
					double extCapacity = ((Task)task).calculateExtendedServiceCapacity(agent);
					if ((count<space)&&(extCapacity>0)) {									
						if (task.precedencyCleared()) {						
							this.bid(receivedCall);
							count++;
						}
						else {
							boolean predInQueue = true;
							for (WorkItemEntity predWI: task.getPredecessors()) {
								if (!predWI.isAggregationNode) {
									Task pred = (Task)predWI;
									if (!
										(agent.getBacklogQ().contains(pred)||agent.getActiveQ().contains(pred))
										) {
										predInQueue = false;
										break;
									}
								}
								else {
									predInQueue = false;
									break;
								}
							}						
							if (predInQueue) {
								this.bid(receivedCall);
								count++;
							}
						}
					}
				}
			}
		}
	}
	public void BiddersSelection() {		
		this.agent.NowRequested.clear();
		HashMap<ServiceProviderAgent,LinkedList<Task>> contractsMap = new HashMap<ServiceProviderAgent,LinkedList<Task>>();
		for (int i=0;i<this.myPurposalCalls.size();i++) {
			PurposalCall p = this.myPurposalCalls.get(i);
			Task task = p.target;
			//System.out.println(task.fullName);
			LinkedList<Bid> wi_bids = new LinkedList<Bid>();
			for (Bid bid : this.receivedBids) {
				if (bid.target.getId() == task.getId()) {
					wi_bids.add(bid);
				}
			}			
			if (!wi_bids.isEmpty()) {
				// Selection Rule Impl
				Bid selectedBid = wi_bids.get( (int) (Math.random()*wi_bids.size()) );
				//
				ServiceProviderAgent selectedBidder = selectedBid.bidder;
				if (contractsMap.containsKey(selectedBidder)) {
					LinkedList<Task> contractWIs = contractsMap.get(selectedBidder);
					contractWIs.add(task);
					contractsMap.put(selectedBid.bidder, contractWIs);
				}
				else {
					LinkedList<Task> contractWIs = new LinkedList<Task>();
					contractWIs.add(task);		
					contractsMap.put(selectedBid.bidder, contractWIs);
				}
			}
		}
		for (ServiceProviderAgent contractor : contractsMap.keySet()) {
			this.buildContract(contractsMap.get(contractor), contractor);
		}
	}
	
	
	public void callForPurposal(Task task, LinkedList<ServiceProviderAgent> candidates) {
		PurposalCall newPurposalCall = new PurposalCall();
		newPurposalCall.target = task;
		newPurposalCall.requester = this.agent;
		this.myPurposalCalls.add(newPurposalCall);
		for (ServiceProviderAgent sp : candidates) {
			((CNPBehavior)sp.myBehavior).receivedPurposalCalls.add(newPurposalCall);
		}
		//System.out.println(this.agent.getName()+" calls for purposal on: "+task.getName());
	}
	public void bid(PurposalCall purposalCall) {
		Bid newBid = new Bid();
		newBid.bidder = this.agent;
		newBid.target = purposalCall.target;
		((CNPBehavior)purposalCall.requester.myBehavior).receivedBids.add(newBid);
		//System.out.println(this.agent.getName()+" responds "+purposalCall.requester.getName()+"'s call for purposal on "+purposalCall.target.getName());
	}
	public void buildContract(LinkedList<Task> tasks, ServiceProviderAgent contractor) {
		Contract newContract = new Contract(tasks, this.agent, contractor);	
		//add contract to both parties
		this.myJiaFangContracts.add(newContract);
		((CNPBehavior)contractor.myBehavior).myYiFangContracts.add(newContract);
		this.agent.NowRequested.add(contractor);
		//System.out.println("\nContract Built on:");
		for (Task task : tasks) {
			if (task.calculateServiceCapacity(contractor)>0) {				
				contractor.acceptWI(task);
			}
			else if (task.calculateExtendedServiceCapacity(contractor)>0){
				((CNPBehavior)(contractor.myBehavior)).callForPurposal(task, contractor.assignWITo);
			}
			//System.out.println(task.fullName);
			for (int i=0;i<this.myPurposalCalls.size();i++) {
				PurposalCall p = this.myPurposalCalls.get(i);
				if (task.getId()==p.target.getId()) {
					p.isEnded = true;
					this.myPurposalCalls.remove(p);
					i--;
				}
			}	
		}
		//System.out.println(" Manager:"+agent.getName()+" Contractor:"+contractor.getName());
	}
	public void cancelContract(Contract contract) {
		LinkedList<Task> tasks = contract.tasks;
		ServiceProviderAgent contractor = contract.contractor;
		((CNPBehavior)(agent.myBehavior)).myJiaFangContracts.remove(contract);
		contract.isCancelled = true;
		agent.getRequestedQ().addAll(tasks);
		for (Task task:tasks) {
			task.setRequester(agent);
		}
	}
}
