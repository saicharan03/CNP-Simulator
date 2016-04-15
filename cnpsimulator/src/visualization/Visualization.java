package visualization;

import java.text.DecimalFormat;
import java.util.ArrayList;

import kanbanBoard.KanbanElement;
import datasemSimulator.SystemOfSystems;
import repast.simphony.context.Context;
import repast.simphony.context.space.graph.NetworkBuilder;
import repast.simphony.context.space.grid.GridFactory;
import repast.simphony.context.space.grid.GridFactoryFinder;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.parameter.Parameters;
import repast.simphony.space.graph.Network;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridBuilderParameters;
import repast.simphony.space.grid.RandomGridAdder;
import repast.simphony.space.grid.SimpleGridAdder;
import repast.simphony.space.grid.WrapAroundBorders;
import repast.simphony.space.grid.StrictBorders;
import serviceProviders.ResourceEntity;
import serviceProviders.ServiceProviderAgent;
import workItems.AggregationNode;
import workItems.AnalysisActivity;
import workItems.ResolutionActivity;
import workItems.WorkItemEntity;

public class Visualization {
	public SystemOfSystems SoS;
	Parameters parameters;
	public Context<Object> context;
	public Grid<Object> grid3D;
	public Grid<Object> grid2D;
	public Grid<Object> gridWIN;
	public Grid<Object> gridKanban;
	public Network<Object> netOrg_Hierarchy;
	public Network<Object> netWI_Hierarchy;
	public Network<Object> netAllocation;
	private int[] grid2Dsize = new int[2];
	private int[] gridWINsize = new int[2];
	private ArrayList<Comments> commentsList= new ArrayList<Comments>();
	
	public Visualization(Context<Object> ctx, SystemOfSystems mySoS) {
		parameters = RunEnvironment.getInstance().getParameters();
		ctx.add(this);
		context = ctx;
		GridFactory gridFactory = GridFactoryFinder.createGridFactory(null);	
		SoS = mySoS;
		grid2Dsize[0]=(SoS.OrgLevels+1)*15; grid2Dsize[1]=SoS.OrgLevels*SoS.OrgComplexity*5+10;
		gridWINsize[0]=(int)(SoS.WINSize*Math.pow(SoS.WINComplexity-1, SoS.WINLevels)+50); gridWINsize[1]=SoS.WINLevels*10+20; 
		System.out.println("2D Graph: "+grid2Dsize[0]+" x "+grid2Dsize[1]);
		System.out.println("WIN Graph: "+gridWINsize[0]+" x "+gridWINsize[1]);

		
		int width;
		int height;
//		grid3D = gridFactory.createGrid("3DGrid", context, 
//				new GridBuilderParameters<Object>(new WrapAroundBorders(), 
//						new SimpleGridAdder<Object>(), true, width, height, depth));	
		width = grid2Dsize[0];
		height = grid2Dsize[1];
		grid2D = gridFactory.createGrid("2DGrid", context, 
				new GridBuilderParameters<Object>(new WrapAroundBorders(), 
						new SimpleGridAdder<Object>(), true, width, height));
		
		width = gridWINsize[0];
		height = gridWINsize[1];
		gridWIN = gridFactory.createGrid("WINGrid", context, 
				new GridBuilderParameters<Object>(new WrapAroundBorders(), 
						new SimpleGridAdder<Object>(), true, width, height));
		netOrg_Hierarchy = new NetworkBuilder<Object>("Org_Hierarchy", context, true).buildNetwork();
		netWI_Hierarchy = new NetworkBuilder<Object>("WI_Hierarchy", context, true).buildNetwork();
		netAllocation = new NetworkBuilder<Object>("Allocation", context, true).buildNetwork();
		
		width = 6;
		height = 20;
		gridKanban = gridFactory.createGrid("KanbanGrid", context, 
				new GridBuilderParameters<Object>(new WrapAroundBorders(), 
						new SimpleGridAdder<Object>(), true, width, height));	
		initializeOrganization();
	}

	@ScheduledMethod(start=0,interval=1,priority=0)
	public void step() {
		this.context.removeAll(commentsList);
		this.commentsList.clear();
		visualizeWorkItemNetwork();
		visualizeOrganization();		
		for (WorkItemEntity task:SoS.endedList){
			if (SoS.context.contains(task)) {
				task.icon.location[0]=0;task.icon.location[1]=0;
				gridWIN.moveTo(task, 0,0);
				grid2D.moveTo(task, 0,0);
			}
		}	
		updateKanbanBoard();
	}
	public void initializeOrganization() {
		for (ServiceProviderAgent agent : SoS.myServiceProviderAgents.values()) {											
			int x= 15*(SoS.OrgLevels - agent.hierarchy);
			int y=grid2Dsize[1]-agent.getId()*5;
			agent.icon.location[0]=x; agent.icon.location[1]=y;			
			grid2D.moveTo(agent,x,y);
			int c = 1;
			for (ResourceEntity resource:agent.getMyResourceEntities()) {
				grid2D.moveTo(resource, agent.icon.location[0]+c+2,agent.icon.location[1]);
				c++;
			}
		}
	}

	public void visualizeWorkItemNetwork() {
		// Initialize
		netWI_Hierarchy.removeEdges();
		int count[] = new int[SoS.WINLevels];
		for (WorkItemEntity wItem: SoS.arrivedList.values()) {
			wItem.icon.isPlaced = false;
		}
		//
		for (WorkItemEntity wItem: SoS.arrivedList.values()) {
			if (!wItem.isEnded) {
				if ((!wItem.isResolutionActivity)&&(!wItem.isAnalysisActivity)) {
					int hierarchy = wItem.hierarchy;
					count[hierarchy]++;
					//wItem.icon.location[0] = count[hierarchy]* (int)(Math.pow((SoS.WINLevels-hierarchy),2)-2*(SoS.WINLevels-hierarchy+1));
					if (wItem.hierarchy>0 || wItem.hierarchy==SoS.WINLevels-1) {
						wItem.icon.location[0] = (int)Math.pow(SoS.WINComplexity,Math.pow(hierarchy,0.7))*count[hierarchy]*2;
						wItem.icon.location[1] = 20+hierarchy*10;	
						//System.out.println(wItem.getName()+" "+wItem.icon.location[0]+" "+wItem.icon.location[1]);
						gridWIN.moveTo(wItem, wItem.icon.location[0], wItem.icon.location[1]);
						wItem.icon.isPlaced = true;					
						if (wItem.isAggregationNode) {
							int s1=0;int s2=0;
							if (wItem.hierarchy==1) {
								count[0] += SoS.WINComplexity;
								for (int i=0;i<((AggregationNode)wItem).getSubtasks().size();i++) {			
									WorkItemEntity wItemsTask = ((AggregationNode)wItem).getSubtasks().get(i);						
									if ( SoS.arrivedList.containsKey(wItemsTask.getId()) ){
										if (wItemsTask.hierarchy==0) {								
											wItemsTask.icon.location[0] = wItem.icon.location[0]+s1*2;
											wItemsTask.icon.location[1] = wItem.icon.location[1]-s2*2-2;
											gridWIN.moveTo(wItemsTask, wItemsTask.icon.location[0], wItemsTask.icon.location[1]);
											wItemsTask.icon.isPlaced = true;
											s1++;
											if (s1>=SoS.WINComplexity){
												s1=0;s2++;									
											}
										}
									}
								}
							}
							for (int i=0;i<((AggregationNode)wItem).getSubtasks().size();i++) {			
								WorkItemEntity wItemsTask = ((AggregationNode)wItem).getSubtasks().get(i);
								if (!wItemsTask.isEnded) {
									if (wItemsTask.getUppertasks().contains(wItem)) {
										netWI_Hierarchy.addEdge(wItem,wItemsTask);
									}
								}
							}
						}
					}
					if (wItem.hierarchy==0 && !wItem.icon.isPlaced) {
						count[0] ++;
						wItem.icon.location[0] = (int)( (count[0]+1) * 2);
						wItem.icon.location[1] = 20+(hierarchy+1)*10 - 2;
						gridWIN.moveTo(wItem, wItem.icon.location[0], wItem.icon.location[1]);
						wItem.icon.isPlaced = true;
					}
				}			
				else if (wItem.isAnalysisActivity) {
					WorkItemEntity wItem1 = ((AnalysisActivity)wItem).AnalysisObject;
					wItem.icon.location[0] = wItem1.icon.location[0]+2;
					wItem.icon.location[1] = wItem1.icon.location[1]+2;
					gridWIN.moveTo(wItem, wItem.icon.location[0], wItem.icon.location[1]);
					netWI_Hierarchy.addEdge(wItem,wItem1);					
				}
			}
			else {
				gridWIN.moveTo(wItem, 0, 0);
			}
		}
		// Coloring
		for (WorkItemEntity wItem: SoS.arrivedList.values()) {			
			wItem.icon.color[0]=224;wItem.icon.color[1]=224;wItem.icon.color[2]=224;
			if (wItem.isStarted) {	
				if (wItem.isCompleted) {
					wItem.icon.color[0]=0;wItem.icon.color[1]=255;wItem.icon.color[2]=0;
				}
				else {
					if (wItem.getProgress() < wItem.getPreviousProgress()) {
						wItem.icon.color[0]=255;wItem.icon.color[1]=0;wItem.icon.color[2]=0;
					}
					else {
						wItem.icon.color[0]=51;wItem.icon.color[1]=153;wItem.icon.color[2]=255;
					}	
				}
			}
			if (!wItem.precedencyCleared()) {
				if (wItem.isSuspended) {
					wItem.icon.color[0]=127;wItem.icon.color[1]=0;wItem.icon.color[2]=255;
				}
				else {
					wItem.icon.color[0]=255;wItem.icon.color[1]=128;wItem.icon.color[2]=0;
				}
			}
			if (wItem.isEnded) {
				wItem.icon.color[0]=0;wItem.icon.color[1]=0;wItem.icon.color[2]=0;
			}
			
			if (!wItem.isEnded) {
				commentWI(wItem);
			}
		}
	}
	public void visualizeOrganization() {	
		netOrg_Hierarchy.removeEdges();
		netAllocation.removeEdges();
		for (ServiceProviderAgent agent:SoS.myServiceProviderAgents.values()){			
			int count;
			if (agent.getResourceUtilization()<0.2) {
				agent.icon.color[0]=224;agent.icon.color[1]=224;agent.icon.color[2]=224;
			}
			else if (agent.getResourceUtilization()>=0.8) {
				agent.icon.color[0]=255;agent.icon.color[1]=255;agent.icon.color[2]=0;
			}
			else {
				agent.icon.color[0]=51;agent.icon.color[1]=153;agent.icon.color[2]=255;
			}
			
			count=1;
			for (WorkItemEntity task:agent.getActiveQ()){
				if (count>10) {
					grid2D.moveTo(task, 0,0);
				}
				else {
					grid2D.moveTo(task, agent.icon.location[0]+count+2,agent.icon.location[1]-1);
					for (ResourceEntity resource:task.getAllocatedResources()) {
						netAllocation.addEdge(task,resource);
					}
					count++;
				}								
			}
			count=1;
			for (WorkItemEntity task:agent.getBacklogQ()){
				if (count>10) {
					grid2D.moveTo(task, 0,0);
				}
				else {
					grid2D.moveTo(task, agent.icon.location[0]+count+2,agent.icon.location[1]-2);
					count++;
				}				
			}
			count=1;
			for (WorkItemEntity wi:agent.getComplexQ()){
				if (count>10) {
					grid2D.moveTo(wi, 0,0);
				}
				else {
					grid2D.moveTo(wi, agent.icon.location[0]+count+2,agent.icon.location[1]-3);
					count++;
				}				
			}
			count=1;
			for (WorkItemEntity wi:agent.getRequestedQ()){
//				if (count>10) {
//					grid2D.moveTo(wi, 0,0);
//				}
//				else {
//					grid2D.moveTo(wi, agent.icon.location[0]+count+2,agent.icon.location[1]-4);
//					count++;
//				}			
				grid2D.moveTo(wi, 0,0);
			}
			count=1;
			for (WorkItemEntity wi:agent.getCompleteQ()){
				grid2D.moveTo(wi, 0,0);
			}
			commentSP(agent);
		}
		for (ServiceProviderAgent agent : SoS.myServiceProviderAgents.values()) {
			for (ServiceProviderAgent target:agent.NowRequested) {
				netOrg_Hierarchy.addEdge(agent, target);
			}
		}
	}
	public void updateKanbanBoard() {
		for (KanbanElement element:this.SoS.myKanbanBoard.KanbanElements) {
			context.remove(element);
		}
		this.SoS.myKanbanBoard.clearBoard();
		
		for (WorkItemEntity wi:this.SoS.arrivedList.values()) {
			if ( (wi.hierarchy==SoS.WINLevels-1) ) {
				if (!wi.isAnalysisActivity && !wi.isResolutionActivity) {
					this.SoS.myKanbanBoard.addWorkItem(wi);
				}				
			}
		}
		this.SoS.myKanbanBoard.updateElements();
		for (KanbanElement element:this.SoS.myKanbanBoard.KanbanElements) {
			context.add(element);
			gridKanban.moveTo(element, element.location[0], 20-element.location[1]-1);
		}
	}
	public void commentWI(WorkItemEntity wi) {
		Comments comments = new Comments();
		//comments.addComment("\n\n\nID:"+Integer.toString(wi.getId()));
		comments.addComment("type:"+this.SoS.myWorkItemTypes.get(wi.typeId).getName());
		if (!wi.isEnded) {
			//comments.addComment("Value:"+new DecimalFormat("##.#").format(wi.Value));
			comments.addComment("currentValue:"+new DecimalFormat("##.#").format(wi.currentValue));
			comments.addComment("progress:"+Integer.toString((int)(wi.getProgress()*100))+"%");		
			if (!wi.isAggregationNode) {				
				comments.addComment("efficiency:"+Integer.toString((int)(wi.getServiceEfficiency()*100))+"%");
				comments.addComment(SoS.myServices.get(wi.serviceId).getName()+" x"+(int)wi.efforts);
				if (wi.getReworkCount()>0) {
					comments.addComment("rework: "+Integer.toString(wi.getReworkCount()));
				}
				if (wi.getResolutionCount()>0) {
					comments.addComment("resolution: "+Integer.toString(wi.getResolutionCount()));
				}
			}
		}
		else {
			comments.addComment("\n-- Ended --");
		}
		this.commentsList.add(comments);
		this.context.add(comments);
		if (!wi.isAggregationNode) {
			gridWIN.moveTo(comments, wi.icon.location[0],wi.icon.location[1]-1);
		}
		else {
			gridWIN.moveTo(comments, wi.icon.location[0],wi.icon.location[1]+1);
		}
	}
	public void commentSP(ServiceProviderAgent sp) {
		Comments comments = new Comments();
		comments.addComment("Type:\n "+this.SoS.myServiceProviderTypes.get(sp.typeId).getName());
		this.commentsList.add(comments);
		this.context.add(comments);
		grid2D.moveTo(comments, sp.icon.location[0]-2,sp.icon.location[1]+1);
		comments.addComment("Utilization:\n "+Integer.toString((int)(sp.getResourceUtilization()*100))+"%");
		this.commentsList.add(comments);
		this.context.add(comments);
		grid2D.moveTo(comments, sp.icon.location[0]-2,sp.icon.location[1]);
		
		Comments comments1 = new Comments();
		comments1.addComment("In Progress: "+sp.getActiveQ().size());
		this.commentsList.add(comments1);
		this.context.add(comments1);
		grid2D.moveTo(comments1, sp.icon.location[0]+1,sp.icon.location[1]-1);	
		Comments comments2 = new Comments();
		comments2.addComment("Accepted: "+sp.getBacklogQ().size());
		this.commentsList.add(comments2);
		this.context.add(comments2);
		grid2D.moveTo(comments2, sp.icon.location[0]+1,sp.icon.location[1]-2);	
		Comments comments3 = new Comments();
		comments3.addComment("Aggregation Nodes: "+sp.getComplexQ().size());
		this.commentsList.add(comments3);
		this.context.add(comments3);
		grid2D.moveTo(comments3, sp.icon.location[0]+1,sp.icon.location[1]-3);
		Comments comments4 = new Comments();
		comments4.addComment("Requested: "+sp.getRequestedQ().size());
		this.commentsList.add(comments4);
		this.context.add(comments4);
		grid2D.moveTo(comments4, sp.icon.location[0]+1,sp.icon.location[1]-4);
	}
}
