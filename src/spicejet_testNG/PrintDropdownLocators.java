package spicejet_testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class PrintDropdownLocators {
	WebDriver driver;
	  public void login() throws Exception {
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin");
			driver.findElement(By.name("submit")).click();
			Thread.sleep(2000);
	  }
	  public void pr(){
			driver.findElement(By.linkText("Registration")).click();
			driver.findElement(By.linkText("Permanent Registration")).click();
	  }
  @Test(enabled=false)
  public void printDD_Loc() {
	  List<WebElement> str= driver.findElements(By.tagName("select"));
	  System.out.println(str.size());
	  for (int i = 0; i < str.size(); i++) {
		
		System.out.println(str.get(i).getAttribute("name"));
		
	}
  }
  @Test
  public void printtxt_btn_Loc() {
	 List<WebElement> str= driver.findElements(By.tagName("input"));
	 System.out.println(str.size());
	 for (int i = 0; i < str.size(); i++) {
		  if(str.get(i).getAttribute("type").equalsIgnoreCase("text"))
		  {
		System.out.println("Textbox loc :"+str.get(i).getAttribute("name"));
		  }
		  else if(str.get(i).getAttribute("class").equalsIgnoreCase("log"))
		  {
			  System.out.println("Btn loc :"+str.get(i).getAttribute("value"));
		  }
	}
  }
  
  @BeforeClass
  public void beforeClass() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	  driver.manage().window().maximize();
	  driver.get("http://selenium4testing.com/hms");
	  login();
	  pr();
  }

  @AfterClass
  public void afterClass() {
  }

}
