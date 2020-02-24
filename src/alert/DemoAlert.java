package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAlert {

	@Test
	public void handleAlert() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
		
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		
		alt.getText();
		System.out.println(alt.getText());
		
		alt.dismiss();
		//driver.switchTo().alert().dismiss();
		
	}
}
