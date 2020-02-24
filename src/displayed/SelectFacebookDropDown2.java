package displayed;

import java.util.List;

import javax.sound.sampled.LineListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jgoodies.forms.layout.Size;

public class SelectFacebookDropDown2 {
	@Test
	public void SelectDDValue() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement month_dropdown= driver.findElement(By.id("month"));
		
		Select month_dd=new Select(month_dropdown);
		
		List<WebElement> month_list=month_dd.getOptions();
		
		int total_month = month_list.size();
		
		//Assert.assertEquals(total_month, 13);
		
		System.out.println("Toatal months count "+total_month);
		
		for(WebElement ele : month_list) {
			
			String month_name = ele.getText();
			System.out.println("Months are==="+month_name);
		}
	}
}
