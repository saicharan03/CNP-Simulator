package processModels;

import java.util.HashMap;
import java.util.LinkedList;
import workItems.AggregationNode;

public class ProcessModel {
	public String name;
	public HashMap<Integer,Stage> stages = new HashMap<Integer,Stage>();
	
	public ProcessModel(String name) {
		this.name = name;
		this.stages.put(0,new Stage("(Not\nStarted)"));
		this.stages.put(-1,new Stage("(Ended)"));
	}
	public void addStage(int key,String stageName) {
		this.stages.put(key,new Stage(stageName));
	}
	public void updateStage(AggregationNode aggr) {
		int maxStages = this.stages.size();
		if (aggr.isEnded) {
			aggr.setCurrentProcessStage(-1);
		}
		else if (!aggr.isStarted) {
			aggr.setCurrentProcessStage(0);
		}
//		else {
//			if (aggr.getProgress()==0) {
//				aggr.setCurrentProcessStage(1);
//			}
//			else {
//				double x = aggr.getProgress();
//				x = Math.pow(x, 0.7);
//				x = x*(maxStages-2);
//				x = Math.floor(x)+1;
//				if (x >= maxStages-2) {
//					if (aggr.isCompleted) {
//						aggr.setCurrentProcessStage(-1);
//					}
//					else {
//						aggr.setCurrentProcessStage(maxStages-2);
//					}
//				}
//				else {
//					aggr.setCurrentProcessStage((int)x);
//				}	
//			}
//		}
	}
	public void transition(AggregationNode aggr) {
		
	}
}
