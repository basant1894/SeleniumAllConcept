package spicejet_testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ValidateDropdownValues {
	WebDriver driver;
	@Test
	public void f() {
		String id="ctl00_mainContent_ddl_Adult";
		List<WebElement> str=new Select(driver.findElement(By.id(id))).getOptions();
		System.out.println(str.size());
		for (int i = 0; i < str.size(); i++) {
			//Print and select 5 adults
			if(str.get(i).getText().equalsIgnoreCase("5 Adults"))
			{
				System.out.println(str.get(i).getText());
				new Select(driver.findElement(By.id(id))).selectByVisibleText(str.get(i).getText());
			}
			//Print all values except 5 adults	
			if(!str.get(i).getText().equalsIgnoreCase("5 Adults"))
			{
				System.out.println(str.get(i).getText());
			}

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

	@AfterTest
	public void afterTest() {
	}

}
