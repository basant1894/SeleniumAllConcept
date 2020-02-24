package alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebPushNotification_FireFox {

	public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D:\\Library\\geckodriver.exe");
		
		FirefoxOptions opt = new FirefoxOptions();
		opt.addPreference("dom.webnotifications.enabled", false);
		
		WebDriver driver = new FirefoxDriver(opt);
		
		driver.get("https://www.redbus.in/");
	}

}
