package datasemSimulator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import repast.simphony.context.Context;
import repast.simphony.dataLoader.ContextBuilder;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.parameter.Parameters;


public class DatasemSimulatorModel implements ContextBuilder<Object>{
	
	private File scenarioXmlFile = new File("SimulationScenarios/ExperimentModel.xml");
	private SimulationContextBuilder contextbuilder = new SimulationContextBuilder(scenarioXmlFile);
	public boolean VisualizationOn = true;
	
	public Context<Object> build(Context<Object> context) {
		File folder = new File("SimulationOutputs");
		clearFolder(folder);

		contextbuilder.ContextImplementation(context);
		Parameters p = RunEnvironment.getInstance().getParameters();
		int numReplications = (Integer)p.getValue("NumReplications");
		System.out.println("\nREPLICATION #"+numReplications+"\n");

		return context;
	}
	
	public static void clearFolder(File folder) {
	    File[] files = folder.listFiles();
	    if(files!=null) { //some JVMs return null for empty dirs
	        for(File f: files) {
	            if(f.isDirectory()) {
	                clearFolder(f);
	            } else {
	                f.delete();
	            }
	        }
	    }
	}
	public static void copyFile(File sourceFile, File destFile) throws IOException {
	    if(!destFile.exists()) {
	        destFile.createNewFile();
	    }
	    FileChannel source = null;
	    FileChannel destination = null;
	    try {
	        source = new FileInputStream(sourceFile).getChannel();
	        destination = new FileOutputStream(destFile).getChannel();
	        destination.transferFrom(source, 0, source.size());
	    }
	    finally {
	        if(source != null) {
	            source.close();
	        }
	        if(destination != null) {
	            destination.close();
	        }
	    }
	}
}