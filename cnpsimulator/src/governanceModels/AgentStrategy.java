package governanceModels;

import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import contractNetProtocol.ContractNetProtocol;
import serviceProviders.ResourceEntity;
import serviceProviders.ServiceProviderAgent;
import workItems.Task;
import workItems.WorkItemEntity;
import xtext.objectsModel.GovernanceStrategy;
import xtext.objectsModel.Mechanism;
import xtext.objectsModel.impl.GovernanceStrategyImpl;

public class AgentStrategy extends GovernanceStrategyImpl {
	public boolean isPull=false;
	public boolean isPush=false;
	public boolean isCNP=false;
	
	public int Cadence =1;
	protected WISelectionRule mySelectionRule;
	protected WIAcceptanceRule myAcceptanceRule;
	protected WIAssignmentRule myAssignmentRule;
	protected ResourceAllocationRule myAllocationRule;
	
	public AgentStrategy(GovernanceStrategy myGovernanceStrategy) {
		myAcceptanceRule = new WIAcceptanceRule();
		mySelectionRule = new WISelectionRule();
		myAssignmentRule = new WIAssignmentRule();
		myAllocationRule = new ResourceAllocationRule();
		this.implementAgentStrategy(myGovernanceStrategy);
	}
	
	public void implementAgentStrategy(GovernanceStrategy myGovernanceStrategy) {
		if (myGovernanceStrategy.getType().matches("cnp")) {
			new ContractNetProtocol(myGovernanceStrategy);
			this.isCNP = true;
			this.implementPullStrategy(myGovernanceStrategy);
		}
		else if (myGovernanceStrategy.getType().matches("pull")){
			this.implementPullStrategy(myGovernanceStrategy);
			this.isPull = true;
		}	
		else if (myGovernanceStrategy.getType().matches("push")){
			this.implementPullStrategy(myGovernanceStrategy);
			this.isPush = true;
		}
		else {
			String msg = myGovernanceStrategy.getType()+" is not a valid Strategy Type!"+"\nclick OK to use default Governance Strategy(push)";
			JOptionPane.showMessageDialog(null,msg);
		}
	}

	public void implementPullStrategy(GovernanceStrategy myGovernanceStrategy) {
		for (Mechanism m: myGovernanceStrategy.getMechanisms()) {
			implementMechanism(m);
		}
	}
	public void implementMechanism(Mechanism m) {
		if (m.getName().matches("Cadence")) {
			this.Cadence = Integer.valueOf(m.getValue());
		}
		else if (m.getName().matches("Acceptance")) {
			myAcceptanceRule.implementWIAcceptanceRule(m);
		}
		else if (m.getName().matches("Prioritization") || m.getName().matches("Selection")) {			
			mySelectionRule.implementWISelectionRule(m);
		}
		else if (m.getName().matches("Assignment")) {
			myAssignmentRule.implementWIAssignmentRule(m);
		}
		else if (m.getName().matches("Allocation")) {
			myAllocationRule.implementWIAllocationRule(m);
		}
//		else if (m.getName().matches("Outsourcing")) {
//			
//		}
		else {
			String msg = m.getName()+" is not a valid Mechanism Name!" + "\n click OK to use default settings";
			JOptionPane.showMessageDialog(null,msg);
		}		
	}
	public LinkedList<Task> applyWorkPrioritization(ServiceProviderAgent sp,LinkedList<Task> queue) {		
		return this.mySelectionRule.applyRule(sp, queue);		
	}
	public HashMap<Task, ServiceProviderAgent> applyAgentSelection(ServiceProviderAgent me, LinkedList<Task> WIs, LinkedList<ServiceProviderAgent> SPs) {
		return this.myAssignmentRule.applyRule(me, WIs, SPs);
	}
	public HashMap<Task, ResourceEntity> applyResourceAllocation(ServiceProviderAgent me, LinkedList<Task> WIs) {
		return this.myAllocationRule.applyRule(me, WIs);
	}
	public void applyWorkAcceptance(ServiceProviderAgent me) {
		me.myStrategy.myAcceptanceRule.applyRule(me);
		return;
	}
}
