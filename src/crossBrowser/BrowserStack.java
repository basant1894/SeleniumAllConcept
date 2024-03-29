package crossBrowser;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class BrowserStack {
	
	
	
	  public static final String USERNAME = "basantchaudhary2";
	  public static final String AUTOMATE_KEY = "NJBFqxqJcjnQUm6PyL9s";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


	  
	  public static void main(String[] args) throws MalformedURLException {
		
	
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "65.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "7");
		    caps.setCapability("resolution", "1024x768");

		    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		    driver.get("http://www.google.com");
		    WebElement element = driver.findElement(By.name("q"));

		    element.sendKeys("BrowserStack");
		    element.submit();

		    System.out.println(driver.getTitle());
		    driver.quit();

	  
}
}
