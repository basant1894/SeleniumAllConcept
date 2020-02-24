package spicejet_testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PrintAllLinks {
	WebDriver driver;
  @Test
  public void f() {
	  List<WebElement> str=driver.findElements(By.tagName("a"));
	  System.out.println(str.size());
	  for(int i=0; i<str.size(); i++)
	  {
		  if(!str.get(i).getText().equalsIgnoreCase(""))
		  {
		  System.out.println(str.get(i).getText()); //str[i]
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	  driver.manage().window().maximize();
	  driver.get("http://selenium4testing.com/");
	//  driver.findElement(By.linkText("Desktop Site")).click();  
	  driver.findElement(By.id("closediv")).click();
  }

  @AfterTest
  public void afterTest() {
  }

}
