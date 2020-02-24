package configurationDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class TestSeleniumChrome {
	
	ConfigReader config;
	@BeforeTest
	public void setUp()
	{
		config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		System.out.println("=========Test Started=========");
	}
	
	@Test
	public void testChrome() throws Exception {
		
		
		System.out.println("=========Setup Ready=========");
	WebDriver driver=new ChromeDriver();
	driver.get(config.getApplicationUrl());
	driver.quit();
	System.out.println("=========Test Close=========");	
	}
	
}
