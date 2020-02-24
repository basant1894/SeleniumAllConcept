package spicejet_testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AjaxControl {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	  Thread.sleep(2000);
	  String str;
	  str=driver.findElement(By.xpath(".//*[@id='sbtc']/div[2]/div[2]/div[1]")).getText();
	  System.out.println(str);
	  String[] s= str.split("\n");
	  System.out.println(s.length);
	  for (int i = 0; i < s.length; i++) {
		  if(s[i].equalsIgnoreCase("selenium tutorial"))
		  {
			  System.out.println(s[i]);
			  driver.findElement(By.id("lst-ib")).clear();
			  driver.findElement(By.id("lst-ib")).sendKeys(s[i]);
			  
		  }
	}
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://google.co.in/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
