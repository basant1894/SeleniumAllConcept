package displayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookDropDown {
	
	@Test
	public void SelectDDValue() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement month_dropdown= driver.findElement(By.id("month"));
		
		Select month_dd=new Select(month_dropdown);
		 
		//It will select March
		month_dd.selectByIndex(3);
		
		//It will select Oct
		month_dd.selectByValue("10");

		Thread.sleep(3000);
		
		//It will select Aug
	    month_dd.selectByVisibleText("Aug");	
	}	
}
