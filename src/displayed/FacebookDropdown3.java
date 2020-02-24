package displayed;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropdown3 {

	public static void main(String... args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement day= driver.findElement(By.id("day"));
	WebElement month= driver.findElement(By.id("month"));
	WebElement year= driver.findElement(By.id("year"));
	
	Select select = new Select(day);
	select.selectByIndex(10);
	
	//it will check if your dropdown is multiselected type or not
	System.out.println(select.isMultiple()); 
	
	List<WebElement> listDays = select.getOptions();
	System.out.println(listDays.size());
	
	int TotalDays = listDays.size()-1;
	System.out.println("Total days are: "+TotalDays);
	
	for(int i=0; i<listDays.size(); i++) {
		String dayValue = listDays.get(i).getText();
		System.out.println(dayValue);
		
		//selecting value
		if(dayValue.equals("15")) {
			listDays.get(i).click();
			break;
		}
	  }
	}
}
