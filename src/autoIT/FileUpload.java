package autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class FileUpload {
	public WebDriver driver;

	@Test
	public void testautoit() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		/*DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
	    driver= new FirefoxDriver(capabilities);*/
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/fileupload.html");
		
		driver.findElement(By.name("resumeupload")).click();
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\AutoIT\\fileupload.exe");
		
	}
}
