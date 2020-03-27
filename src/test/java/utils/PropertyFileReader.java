package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


// used to read data from property files

public class PropertyFileReader {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\configPropery\\config.properties");
		prop.load(fis);
		
		System.out.println("URI is: "+prop.getProperty("uri"));
		System.out.println("Browser is: "+prop.getProperty("browser"));
		
	}

}
