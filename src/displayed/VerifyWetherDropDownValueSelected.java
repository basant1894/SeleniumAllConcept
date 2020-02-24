package displayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VerifyWetherDropDownValueSelected {
	
	@Test
	public void SelectDDValue() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement month_dropdown= driver.findElement(By.id("month"));
		
		Select month_dd=new Select(month_dropdown);
		
		WebElement selected_value = month_dd.getFirstSelectedOption();
		System.out.println("Before selection selected value is "+selected_value.getText());
		
		//It will select March
		month_dd.selectByIndex(3);
		

		WebElement selected_value1 = month_dd.getFirstSelectedOption();
		System.out.println("After selection selected value is "+selected_value.getText());
	}

}
