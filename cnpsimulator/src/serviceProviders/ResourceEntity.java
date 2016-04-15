package serviceProviders;

import java.util.LinkedList;

import workItems.Task;
import workItems.WorkItemEntity;
import xtext.objectsModel.Asset;
import xtext.objectsModel.Skill;
import xtext.objectsModel.impl.AssetImpl;

public class ResourceEntity extends AssetImpl{
	public Asset myResource;
	public int WIPLimit = 1;
	
	public boolean busy = false;
	private LinkedList<Task> wip  = new LinkedList<Task>();
	public LinkedList<Task> tempQ = new LinkedList<Task>();
	
	public ResourceEntity(Asset myResource) {
		this.myResource = myResource;
		this.id = myResource.getId();
		this.name = myResource.getName();
		this.skillSet = myResource.getSkillSet();
	}
	public double getEfficiency(int sId) {
		double e = 0;
		for (Skill sk:this.skillSet) {
			if (sk.getService().getId()==sId) {
				e = sk.getEfficiency();
				break;
			}
		}
		return e;
	}
	public void allocateTo(Task t) {
	    t.allocateResource(this);
		this.getWip().add(t);
		this.setBusy();
	}
	public void withdrawFrom(Task t) {
		t.withdrawResource(this);
		this.getWip().remove(t);
		if (this.getWip().size()==0) {
			this.setIdle();
		}
	}
	public void setBusy () {
		this.busy = true;
	}
	public void setIdle () {
		this.busy = false;
	}
	public Boolean isBusy () {
		return this.busy;
	}
	public Boolean isAvailable () {
		if (this.getWip().size() < this.WIPLimit) {
			return true;
		}
		else {
			return false;
		}
	}
	public LinkedList<Task> getWip() {
		return wip;
	}
	public void setWip(LinkedList<Task> wip) {
		this.wip = wip;
	}
}
