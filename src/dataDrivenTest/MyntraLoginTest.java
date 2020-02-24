package dataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class MyntraLoginTest {
	WebDriver driver;
	
	
	@Test
	public void login_Test() throws BiffException, IOException, InterruptedException{
		
		FileInputStream fis = new FileInputStream("C:\\ExcelData\\TestData4.xlsx");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet s = wb.getSheet("Sheet1");
		
		for (int i = 1; i < s.getRows(); i++) {
			System.out.println(s.getCell(0, i).getContents());
			driver.findElement(By.name("email")).sendKeys(s.getCell(0, i).getContents());
			
			  System.out.println(s.getCell(1, i).getContents());
			  driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
			  
			  driver.findElement(By.name("submit")).click();
			  Thread.sleep(1000);
		}
			
			
			
		}
		@BeforeTest
		  public void beforeTest() {
			  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		
		
	}

}
