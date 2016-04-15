package contractNetProtocol;

import serviceProviders.ServiceProviderAgent;
import workItems.Task;
import workItems.WorkItemEntity;

public class PurposalCall {
	protected Task target;
	protected ServiceProviderAgent requester;
	protected boolean isEnded = false;
}
