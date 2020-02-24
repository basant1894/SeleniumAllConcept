package WaitGame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Implicitly wait is--always applied globally--is available for all the elements
		//dynamic in nature 
		//it can be changed anywhere and at any time in your code 
		driver.get("https://www.facebook.com");

		WebElement firstName = driver.findElement(By.name("firstname")); 
		WebElement lasstName = driver.findElement(By.name("lastname"));
		WebElement mobileNo = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));

		sendKeys(driver, firstName, 10, "Basu");
		sendKeys(driver, lasstName, 5, "Babu");
		sendKeys(driver, mobileNo, 5, "8598812224");
		sendKeys(driver, password, 10, "xyx@123");

		WebElement forgotAccount = driver.findElement(By.linkText("Forgotten account?"));
		clickOn(driver,forgotAccount, 5);
	}
	//Explicit Wait:
	//1. no explicit keyword or method
	//2. available with WebDriverWait with some expectedConditions
	//3. specific to element
	//4. dynamic in nature
	//5. we should never use implicit wait and explicit wait together
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value){

		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void clickOn(WebDriver driver, WebElement element, int timeout){
		
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
