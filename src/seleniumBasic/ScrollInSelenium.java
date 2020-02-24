package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollInSelenium {

	WebDriver driver;

	@Test
	public void verticalScrolling() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		((JavascriptExecutor) driver).executeScript("Window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("Window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("Window.scrollBy(0, 500)");
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("Window.scrollBy(0, -500)");
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath(".//*[@id='homefeatured']/li[1]/div/div[2]/h5/a")));
	}

}
