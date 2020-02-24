package autoIT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.engprod-charter.net/");
		
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\authentication\\handleauthentication.exe");
		
		
		
	}

}
