package governanceModels;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Comparator;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import repast.simphony.random.RandomHelper;
import repast.simphony.util.SimUtilities;
import serviceProviders.ServiceProviderAgent;
import workItems.WorkItemEntity;
import xtext.objectsModel.Mechanism;
import xtext.objectsModel.MechanismAttribute;

public class WIAcceptanceRule {
	protected String ruleValue;	
	protected HashMap<String,Double>parameters;
	
	public WIAcceptanceRule() {
		ruleValue = "Unlimited";
	}
	public void applyRule(ServiceProviderAgent SP) {		
		//System.out.println(SP.getName()+" Applied "+this.name+" Acceptance Rule");
		if (this.ruleValue.matches("Limited")) {
			SP.myBehavior.WIPLimit = (int) this.getAttribute("WIPLimit");
			SP.myBehavior.BacklogLimit = (int) this.getAttribute("BacklogLimit");
			SP.myBehavior.MultiTasking = (int) this.getAttribute("MaxMultiTasking");
		}
		else {
			SP.myBehavior.BacklogLimit = Integer.MAX_VALUE;
			SP.myBehavior.WIPLimit = Integer.MAX_VALUE;
			SP.myBehavior.MultiTasking = 1;
		}
		return;
	}
	public void implementWIAcceptanceRule(Mechanism m) {
		String value = m.getValue();
		switch (value) {
		case "Limited": 
			ruleValue = value;
			parameters = new HashMap<String,Double>();
			for (MechanismAttribute a : m.getAttributes()) {
				addAttribute(a);
			}
			break;
		case "Unlimited":break;
		default: 
			String msg = m.getName()+" is not a valid Acceptance RuleValue!" + "\n click OK to use default settings(Unlimited)";
			JOptionPane.showMessageDialog(null,msg);			
			break;
		}
	}
	public void addAttribute(MechanismAttribute a) {
		parameters.put(a.getAttribute(), Double.parseDouble(a.getValue()));
	}
	public double getAttribute(String s) {
		return parameters.get(s);
	}
}
