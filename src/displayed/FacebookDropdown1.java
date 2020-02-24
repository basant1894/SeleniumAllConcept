package displayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropdown1 {

	public static void main(String... args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement day= driver.findElement(By.id("day"));
	WebElement month= driver.findElement(By.id("month"));
	WebElement year= driver.findElement(By.id("year"));
	
	//Select select=new Select(day);
	//select.selectByVisibleText("10");
	
	//Select select1=new Select(month);
	//select1.selectByVisibleText("May");
	
	//Select select2=new Select(year);
	//select2.selectByVisibleText("1995");
	
	selectValueFromDropDown(day, "10");
	selectValueFromDropDown(month, "May");
	selectValueFromDropDown(year, "1995");
	
}
	public static void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
}
