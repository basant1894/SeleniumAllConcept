package org.log4j;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestBaseProp {
	
	static Properties properties;
	
	public static void loadData() throws IOException{
	     properties = new Properties();
	     
	     File fil=new File(System.getProperty("user.dir")+"\\AutomationTesting\\TestBaseProp.properties");
	     FileReader fr = new FileReader(fil);
	     properties.load(fr);
	}
	public static String getObject(String Data) throws IOException{
		loadData();
		String data = properties.getProperty(Data);
		
		return data;
	     
	}

}
