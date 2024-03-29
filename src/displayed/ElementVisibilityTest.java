package displayed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/register/");

		// 1.isDisplayed() method: Applicable for all the element
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1); // true

		// 2.isEnabled() method:
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);// false

		// Select I Agree checkbox:
		driver.findElement(By.name("agreeTerms")).click();

		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3); // true

		// 3.isSelected() method: Applicable for checkbox, dropdown,
		// radiobuttons
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);// true

		// de-select the checkbox
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5);// false

	}

}
