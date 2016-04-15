package contractNetProtocol;

import java.util.LinkedList;

import serviceProviders.ServiceProviderAgent;
import workItems.WorkItemEntity;
import xtext.objectsModel.GovernanceStrategy;
import xtext.objectsModel.Mechanism;
import xtext.objectsModel.MechanismAttribute;
import xtext.objectsModel.impl.GovernanceStrategyImpl;

public class ContractNetProtocol extends GovernanceStrategyImpl {
	public LinkedList<ServiceProviderAgent> myAgents = new LinkedList<ServiceProviderAgent>();
	public CNPBehavior myManagerBehavior;
	
	public ContractNetProtocol(GovernanceStrategy strategy) {
		this.implementCNP(strategy);
	}
	public void implementCNP(GovernanceStrategy strategy) {
//		for (Mechanism mech: strategy.getMechanisms()) {
//			if (mech.getName().matches("ContractorBehavior")) {
//				this.myContractorBehavior = new ContractorBehavior();
//				for (MechanismAttribute att:mech.getAttributes()) {
//					if (att.getAttribute().matches("action")) {
//						this.myContractorBehavior.implAction(att.getValue());
//					}
//				}
//			}
//			else if (mech.getName().matches("ManagerBehavior")) {
//				this.myManagerBehavior = new ManagerBehavior();
//				for (MechanismAttribute att:mech.getAttributes()) {
//					if (att.getAttribute().matches("action")) {
//						
//					}
//				}
//			}
//		}
	}
	public void registerAgent(ServiceProviderAgent agent) {
		myAgents.add(agent);
	}
	public void unregisterAgent(ServiceProviderAgent agent) {
		myAgents.remove(agent);
	}
}
