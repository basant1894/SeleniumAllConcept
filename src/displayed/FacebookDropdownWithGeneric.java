package displayed;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropdownWithGeneric {

	static WebDriver driver;
	
	public static void main(String... args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
    driver=new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	String day_xpath = "//select[@id='day']//option";
	String month_xpath = "//select[@id='month']//option";
	String year_xpath = "//select[@id='year']//option";
	
	selectDropDownValue(day_xpath, "18");
	selectDropDownValue(month_xpath, "May");
	selectDropDownValue(year_xpath, "1995");
	
  }
	public static void selectDropDownValue(String xpath, String value) {
		List<WebElement> monthList = driver.findElements(By.xpath(xpath));
		System.out.println(monthList.size());
		
		for (int i = 0; i < monthList.size(); i++) {
			System.out.println(monthList.get(i).getText());
			if(monthList.get(i).getText().equals(value)) {
				monthList.get(i).click();
				break;
		  }	
		}
	}
}
