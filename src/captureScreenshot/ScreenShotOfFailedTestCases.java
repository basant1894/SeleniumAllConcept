package captureScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pom.Utility;

public class ScreenShotOfFailedTestCases {
	
	WebDriver driver;
	
	@Test
	public void failedTest(){
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Learn Automation");
		
	}
	@AfterMethod
	public void tearDown(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			//Utility.captureScreenshot(driver, result.getName());
		}
		driver.quit();
 
		}

	}


