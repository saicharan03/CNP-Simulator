package kanbanBoard;

import java.text.DecimalFormat;
import java.util.LinkedList;

import bsh.This;
import datasemSimulator.SystemOfSystems;
import serviceProviders.ServiceProviderAgent;
import workItems.AggregationNode;
import workItems.WorkItemEntity;

public class KanbanBoard {
	public LinkedList<KanbanElement> KanbanElements = new LinkedList<KanbanElement>();
	public LinkedList<WorkItemEntity> Capabilities = new LinkedList<WorkItemEntity>();
	public SystemOfSystems SoS;

	public KanbanBoard(SystemOfSystems SoS) {
		this.SoS = SoS;			
	}
	public void clearBoard() {
		this.KanbanElements.clear();
		this.Capabilities.clear();
	}
	public void updateElements() {	
		addElement(0,0,"WorkItem\n ",10,255,255);
		addElement(1,0,"\nType /"+"\nLife Cycle\nModel",10,255,255);
		addElement(2,0,"Phase\n ",10,255,255);
		addElement(3,0,"Activation\nTime",20,255,255);	
		addElement(4,0,"Value\nDeployed",20,255,255);
		addElement(5,0,"Current\nProgress",20,255,255);
		addElement(6,0,"Progress\nRate",20,255,255);	

		int row=1;
		double value;
		int r=0;int g=0;int b=0;
		for (int i=0;i<Capabilities.size();i++) {
			WorkItemEntity wi = Capabilities.get(i);
			if (wi.isStarted) {
				if (wi.getProgress() < wi.getPreviousProgress()) {
					r=255;g=0;b=0;
				}
				else if (wi.isSuspended) {
					r=255;g=128;b=0;
				}
				else if (wi.isCompleted) {
					r=0;g=255;b=0;
				}
				else {
					r=51;g=153;b=255;
				}
			}
			else {
				r=224;g=224;b=224;
			}
			addElement(0,row,wi.getName()+'\n',r,g,b);
			
			if (wi.isAggregationNode) {
				addElement(1,row,"\n\n\n\n"+SoS.myWorkItemTypes.get(wi.typeId).getName()+" /"+"\n\n"+((AggregationNode)wi).getProcessModelName(),r,g,b);
				addElement(2,row,'\n'+((AggregationNode)wi).getCurrentProcessStage(),r,g,b);
			}
			else {
				addElement(1,row,"N/A",r,g,b);
				addElement(2,row,"N/A",r,g,b);
			}
			value = wi.activatedTime;
			addElement(3,row,String.valueOf(((int)value))+'\n',r,g,b);
			
			value = wi.getProgress()*wi.currentValue;
			addElement(4,row,new DecimalFormat("##.###").format(value)+'\n',r,g,b);
			
			value = wi.getProgress()*100;
			addElement(5,row,new DecimalFormat("##.#").format(value)+"%"+'\n',r,g,b);
			
			value = wi.getProgressRate()*100;
			addElement(6,row,new DecimalFormat("##.#").format(value)+"%"+'\n',r,g,b);
			
			row++;
		}
	}
	public void addWorkItem(WorkItemEntity cap) {
		Capabilities.add(cap);
	}
	public void addElement(int x,int y,String value,int r,int g, int b) {
		KanbanElement element = new KanbanElement(x,y,value,r,g,b);
		this.KanbanElements.add(element);
	}
}
