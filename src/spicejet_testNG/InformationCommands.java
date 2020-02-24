package spicejet_testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class InformationCommands {
	WebDriver driver;
  @Test
  public void printDisplayNames() {
	  String str;
	  str=driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println(str);
	  
	  String str1=driver.findElement(By.name("btnK")).getAttribute("value");
	  System.out.println(str1);
	  
	  String str2=driver.findElement(By.id("hplogo")).getAttribute("title");
	  System.out.println(str2);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.co.in");
  }

  @AfterTest
  public void afterTest() {
  }

}
