package actionInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardAndMouseEventUsingActionClassInSelenium {
	
	WebDriver driver;
	
	@Test
	public void keyboardevents(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement text = driver.findElement(By.name("q"));
		
		Actions action=new Actions(driver);
		
		Action action1=(Action) action.keyDown(text, Keys.SHIFT).sendKeys("Basant Chaudhary").keyUp(text, Keys.SHIFT).build();
		action1.perform();
		
		
		
		
	}

}
