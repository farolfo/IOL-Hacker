package org.app;

import net.sourceforge.jpcap.capture.CaptureDeviceNotFoundException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class IOLHacker {
	
	private static final Logger LOG = Logger.getLogger(IOLHacker.class);
	
	public static void main(String[] args) {
		initializateLogger();
		CommandLineParameters clp = new CommandLineParameters();
		clp.load(args);
		Logger.getRootLogger().setLevel(clp.getLoggingLevel());
		
		Sniffer sniffer = new Sniffer();
		try{
			sniffer.setInterface(clp.getInterface());
			sniffer.sniff();
		} catch(CaptureDeviceNotFoundException i){
			LOG.error("There are no interfaces or devices detected for sniffing.");
		} catch(UnsatisfiedLinkError e){
			StringBuilder sb = new StringBuilder();
			sb.append("You'r jpcap or libcap library is not well installed, you must have the native libraries installed for this to work. ");
			sb.append("Make shoure you have yout .dll, .jnlib or .so library in one of the following paths: ");
			sb.append(java.lang.System.getProperty("java.library.path"));
			LOG.error(sb.toString());
		} catch(Exception a){
			LOG.error("An unexpected error has occurred");
		}
	}
	
	private static void initializateLogger(){
		/* Logger initialization */
		ConsoleAppender consoleAppender = new ConsoleAppender();
		//String PATTERN = "%d [%p] - %c - %m%n";
		String PATTERN = "%m%n";
		consoleAppender.setLayout(new PatternLayout(PATTERN));
		consoleAppender.setThreshold(Level.TRACE);
		consoleAppender.activateOptions();
		Logger.getRootLogger().addAppender(consoleAppender);	
	}

	
}

