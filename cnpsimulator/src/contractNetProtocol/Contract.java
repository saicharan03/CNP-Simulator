package contractNetProtocol;

import java.util.LinkedList;

import processModels.ValueFunction;
import serviceProviders.ServiceProviderAgent;
import workItems.Task;

public class Contract {
	public LinkedList<Task> tasks = new LinkedList<Task>();
	public ServiceProviderAgent manager;
	public ServiceProviderAgent contractor;
	public ValueFunction valueFunction;
	public int duration;
	public int maxDuration=30;
	public boolean isCancelled;
	
	public Contract(LinkedList<Task> wis, ServiceProviderAgent manager, ServiceProviderAgent contractor) {
		this.tasks.addAll(wis);
		this.manager = manager;
		this.contractor = contractor;
		this.duration = 0;
		this.isCancelled = false;
	}
}
