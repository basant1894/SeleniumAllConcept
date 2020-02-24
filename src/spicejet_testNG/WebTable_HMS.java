package spicejet_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable_HMS {
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
  @Test
  public void f() {
	  String str;
	  str=driver.findElement(By.xpath("//*[@id='form1']/div[1]")).getText();
	//  System.out.println(str);
	  String[] s=str.split("\n");
	  System.out.println(s.length);
	  for(int i=0; i<s.length; i++)
	  {
		  if(s[i].contains("*"))
		  {
			  System.out.println(s[i]);
		  }
	  }
  }
  @BeforeTest //Pre condition
  public void beforeTest() throws Exception {
	 System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://selenium4testing.com/hms/");
	  login();
	  pr();
  }
}
