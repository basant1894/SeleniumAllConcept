package junit;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLinks_Junit {
	public WebDriver driver;

	@Before //Precondition
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
	}
	
	@After //Post condition
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test //Test Scenario
	public void verifyMFAQs() throws Exception {
		driver.findElement(By.linkText("Manual FAQs")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifySFAQs() throws Exception{
		driver.findElement(By.linkText("Selenium FAQs")).click();
		Thread.sleep(2000);
	}
	
	

}






