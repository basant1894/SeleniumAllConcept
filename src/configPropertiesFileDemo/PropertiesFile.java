package configPropertiesFileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	
	//static Properties prop= new Properties();

	public static void main(String[] args) throws IOException {
		readPropertiesFile();
		//writePropertiesFile();
		//readPropertiesFile();
	}

	public static void readPropertiesFile() throws IOException{

		Properties prop= new Properties();
		try {
			InputStream input = new FileInputStream("D:\\Workspace6\\AutomationTesting\\src\\configPropertiesFileDemo\\config.properties");

			prop.load(input);
			System.out.println(prop.getProperty("Name"));
			System.out.println(prop.getProperty("Place"));

		} catch (Exception e) {
			e.printStackTrace();
		}	

	}
	/*//Set data to properties file
	public static void writePropertiesFile(){
		
		Properties prop= new Properties();
		try {
			OutputStream output=new FileOutputStream("D:\\Workspace6\\AutomationTesting\\src\\configPropertiesFileDemo\\config.properties");
			prop.setProperty("Pin", "822124");
			prop.store(output, null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}*/
}


