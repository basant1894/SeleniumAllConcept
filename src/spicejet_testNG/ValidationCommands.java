package spicejet_testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidationCommands {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  String id="ctl00_mainContent_txt_Todate";
	  if(driver.findElement(By.id(id)).isDisplayed())
	  {
		  System.out.println("AVailable");
	  }else{
		  System.out.println("Not AVailable");
	  }
	  
Assert.assertEquals(driver.findElement(By.id(id)).isDisplayed(), true);
Assert.assertEquals(driver.findElement(By.id(id)).isDisplayed(), false);
	  
  }
  @Test(enabled=false)
  public void validateUsername() {
	  if(driver.findElement(By.name("username")).isDisplayed())
	  {
		  System.out.println("Available");
	  }else{
		  System.out.println("Not Available");
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	  driver.manage().window().maximize();
	  driver.get("http://spicejet.com/");
	  driver.findElement(By.linkText("Desktop Site")).click();  
  }
}
