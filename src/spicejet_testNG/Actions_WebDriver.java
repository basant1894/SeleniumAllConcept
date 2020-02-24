package spicejet_testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_WebDriver {
	WebDriver driver;

  @Test
  public void f() throws Exception {
	   Actions a=new Actions(driver);
       a.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
       Thread.sleep(2000);
       driver.findElement(By.linkText("Careers")).click();
      
       //Control+End action
       a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
       Thread.sleep(2000);  
       a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();	  
  }

  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
		driver.findElement(By.linkText("Desktop Site")).click();
   }
}








