package displayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropdown2 {

	public static void main(String... args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement day= driver.findElement(By.id("day"));
	WebElement month= driver.findElement(By.id("month"));
	WebElement year= driver.findElement(By.id("year"));
	
	String dob = "10-May-1995";
	String dobArr[] = dob.split("-");
	
	selectValueFromDropDown(day, dobArr[0]);
	selectValueFromDropDown(month, dobArr[1]);
	selectValueFromDropDown(year, dobArr[2]);
	
}
	public static void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
}
