package processModels;

import workItems.AggregationNode;
import workItems.DevTask;
import workItems.WorkItemEntity;
import xtext.objectsModel.RequiredService;

public class AnalysisPhases {
	public static void generateAnalysisTasks(WorkItemEntity wi) {
		wi = (AggregationNode)wi;
		int c = 0;
		for (RequiredService reqSev : wi.getRequiredAnalysis()) {
			double totalEfforts = reqSev.getEfforts();
			double interval_max = 20;
			double interval_min = 5;
			int serviceId = reqSev.getServiceType().getId();
			while (totalEfforts>0) {
				c++;
				String name = wi.getName()+"."+c;	
				double efforts = interval_min+Math.random()*(interval_max-interval_min);
				efforts = Math.min(efforts, totalEfforts);
				totalEfforts -= efforts;
				if (totalEfforts<=interval_min) {
					efforts+=totalEfforts;
					totalEfforts=0;
				}
				int currentId = wi.SoS.getWICount();
				int st_id = currentId+1;
				wi.SoS.increaseWICount();						
				new DevTask((AggregationNode)wi, st_id, name, serviceId, efforts);
			}
		}
	}
}
