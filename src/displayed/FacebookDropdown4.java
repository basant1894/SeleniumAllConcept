package displayed;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropdown4 {

	public static void main(String... args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	List<WebElement> monthList = driver.findElements(By.xpath("//select[@id='month']//option"));
	System.out.println(monthList.size());
	
	for (int i = 0; i < monthList.size(); i++) {
		System.out.println(monthList.get(i).getText());
		if(monthList.get(i).getText().equals("Jun")) {
			monthList.get(i).click();
			break;
	  }	
	}
  }
}
