package spicejet_testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateDropdown_OneSelectedValue {
	WebDriver driver;
  @Test
  public void f() {
WebElement str=new Select(driver.findElement(By.id(
		              "ctl00_mainContent_ddl_Adult"))).getFirstSelectedOption();
System.out.println(str.getText());
	if(str.getText().equalsIgnoreCase("1 Adult"))
	{
		System.out.println("Default value is 1 Adult");
	}else{
		System.out.println("Default value is not 1 Adult");
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
