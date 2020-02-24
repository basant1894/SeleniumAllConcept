package demoRegistration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest {
	//public String baseUrl= "http://newtours.demoaut.com/";
	public WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}
		
		@Test
		public void verifyHomepageTitle(){
			String expectedTitle="Welcome: Mecury Tours";
			String actualTitle=driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
	}
		@AfterTest
		public void endSession(){
			driver.quit();
		}
	
	}


