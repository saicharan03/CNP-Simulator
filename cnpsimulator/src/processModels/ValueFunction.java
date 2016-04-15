package processModels;

import javax.swing.JOptionPane;

import org.apache.commons.math3.stat.StatUtils;

import workItems.AggregationNode;
import workItems.WorkItemEntity;
import xtext.objectsModel.Mechanism;
import xtext.objectsModel.MechanismAttribute;
import xtext.objectsModel.impl.MechanismImpl;

public class ValueFunction extends MechanismImpl {
	public String type = "Fiat";
	public Mechanism mechanism;

	public ValueFunction(String type) {
		this.type = type;
	}
	public ValueFunction(Mechanism mechanism) {
		if (mechanism.getName().matches("ValueFunction")) {
			this.mechanism = mechanism;
			this.type = mechanism.getValue();
		}
		else {
			String msg = "Mechanism "+mechanism.getName()+" is not a Value Function!" + "\n click OK to use default settings(Neutral)";
			JOptionPane.showMessageDialog(null,msg);
		}
	}
	public ValueFunction() {
	}
	public String getAttributeValue(String attName) {
		String value = "";
		Boolean found = false;
		for (MechanismAttribute att:this.mechanism.getAttributes()) {
			if (att.getAttribute().matches(attName)) {
				value = att.getValue();
				found = true;
				break;
			}
		}
		if (!found) {
			throw new RuntimeException("Value Function Attribute "+attName+" not found!");
		}
		return value;
	}
	
	public void developValue(WorkItemEntity wi) {
		// Derived Hierarchy
		if (this.type.matches("Derive")) {
			algorithmDerivedValue(wi);
		}
		else if (this.type.matches("Fiat")) {
			wi.currentValue = wi.initialValue;
		}
	}
	
	private void algorithmDerivedValue(WorkItemEntity wi) {
			double baseValue = wi.Value;
			//if (wi.getId()==31){System.out.println("base "+baseValue);}
			double hierarchyFactor = Double.parseDouble(getAttributeValue("HierarchyFactor"));
			double dependencyFactor = Double.parseDouble(getAttributeValue("DependencyFactor"));
			//System.out.println(wi.getName()+" "+hierarchyFactor+" "+dependencyFactor);
			double[] weights = new double[((AggregationNode)wi).getSubtasks().size()];
			for (int i=0; i<((AggregationNode)wi).getSubtasks().size();i++){	
				WorkItemEntity subtask = ((AggregationNode)wi).getSubtasks().get(i);
				weights[i] += 1;		
				for (WorkItemEntity successor:subtask.getSuccessors()) {
					if (!(successor.isAnalysisActivity||successor.isResolutionActivity)) {
						if (((AggregationNode)wi).getSubtasks().contains(successor)) {
							weights[i] += dependencyFactor;
						}
					}
				}
				//weights[i] = 0.5*weights[i] + Math.random()*weights[i];
			}
			double totalWeights = StatUtils.sum(weights);
			for (int i=0; i<((AggregationNode)wi).getSubtasks().size();i++){
				WorkItemEntity subtask = ((AggregationNode)wi).getSubtasks().get(i);		
				double incSValue = (weights[i]/totalWeights)*baseValue*(1-hierarchyFactor);
				//
				incSValue = Math.max(0, incSValue);
				incSValue = Math.min(wi.currentValue, incSValue);
				//
				double previousSValue = subtask.Value;
				subtask.Value += incSValue;	
				subtask.currentValue += incSValue;			
				wi.currentValue -= incSValue;
				if (subtask.isAggregationNode) {			
					if (subtask.isEnded) {
						subtask.SoS.deliverValue(incSValue);
					}
					else if (((AggregationNode)subtask).currentAnalysisStage==((AggregationNode)subtask).totalAnalysisStages) {
						subtask.Value = incSValue;
						developValue(subtask);
						subtask.Value += previousSValue;			
					}
				}
				else {
					if (subtask.isEnded) {
						subtask.SoS.deliverValue(incSValue);
					}
				}
			}
	}
	
}
