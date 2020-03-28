package collectionPackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {

	public static Logger log=Logger.getLogger(Logs.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure(".\\src\\test\\resources\\configPropery\\log4j.properties");
		
		log.info("Logs started creeating");
		log.error("Something went wrong");
		

	}

}
