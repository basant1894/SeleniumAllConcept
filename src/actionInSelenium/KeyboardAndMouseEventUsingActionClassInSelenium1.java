package actionInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardAndMouseEventUsingActionClassInSelenium1 {
	
	WebDriver driver;
	
	@Test
	public void keyboardevents1(){
        System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		
		Actions action=new Actions(driver);
	    action.keyDown(firstname, Keys.SHIFT).sendKeys("Basant").keyUp(firstname, Keys.SHIFT).build().perform();
	    action.keyDown(lastname, Keys.SHIFT).sendKeys("Chaudhary").keyUp(lastname, Keys.SHIFT).build().perform();
	    action.keyDown(email, Keys.SHIFT).sendKeys("test@gmail.com").keyUp(email, Keys.SHIFT).build().perform();
	    action.keyDown(pass, Keys.SHIFT).sendKeys("686868").keyUp(pass, Keys.SHIFT).build().perform();
	}

}
