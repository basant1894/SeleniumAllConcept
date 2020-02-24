package ioStreams;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class LoginRetesting_Excel {
	WebDriver driver;
  @Test
  public void reTesting() throws Exception  {
	  FileInputStream fi=new FileInputStream("C:\\ExcelData\\TestData2.xlsx");
	  Workbook w=Workbook.getWorkbook(fi);
	  Sheet s=w.getSheet("LoginData");
	  for (int i = 1; i < s.getRows(); i++) {
		  System.out.println(s.getCell(0, i).getContents());
		  driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
		  System.out.println(s.getCell(1, i).getContents());
		  driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(1000);
		      try{
		    	   driver.findElement(By.linkText("Logout")).click();
		    	   System.out.println("pass");
		      } catch(Exception e) {
		    	     System.out.println("Fail");
		    	     driver.switchTo().alert().accept();
		      }
		Thread.sleep(1000);
	          }
      }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://selenium4testing.com/hms");
	  }
	  @AfterTest
	  public void afterTest() {
  }
}
