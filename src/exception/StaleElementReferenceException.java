package exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://pavantestingtools.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement link = driver.findElement(By.xpath("//*[@id='site-navigationpbt']/div/ul/li[13]/a"));
		link.click();

		driver.navigate().back();
		Thread.sleep(5000);

		try {
			link.click();

		} catch (org.openqa.selenium.StaleElementReferenceException e) {
			link = driver.findElement(By.xpath("//*[@id='site-navigationpbt']/div/ul/li[13]/a"));
			link.click();
		}
	}
}


