package seleniumBasic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZoomInZoomOut {
	WebDriver driver;

	@Test
	public void ZoomInZoomOutInSelenium() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='40%'");
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100%'");
	}

}
