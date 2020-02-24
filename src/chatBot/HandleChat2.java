package chatBot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

public class HandleChat2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		System.out.println("Waiting for Frame");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@style,'height') and contains(@class,'intercom')]")));
		
		System.out.println("Frame Found and Switched");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Sign up the team')]"))).perform();

		System.out.println("Mouse hover");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'dismiss-button')]")).click();
		
		System.out.println("Closing Chat bot");
	}

}
