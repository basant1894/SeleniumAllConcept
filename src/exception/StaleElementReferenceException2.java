package exception;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.freecrm.com/");
		
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("basu1894");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("basu");
		
		driver.navigate().refresh();
		
		try{
		uname.sendKeys("basu1894");
		
		}catch(StaleElementReferenceException e){
			
			uname = driver.findElement(By.name("username"));
			uname.sendKeys("basu1894");
		}
	}
}
