package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class testOnGrid {
	
	@Test
	public void test1() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
		
		
		URL url=new URL("http://localhost:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url, cap);
		driver.get("http://learn-automation.com");
		System.out.println("Title is "+driver.getTitle());
		driver.quit();
		
		
	}

}
