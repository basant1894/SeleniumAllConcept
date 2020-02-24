package webdriverNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4Links_Parameter {
	private WebDriver driver;
	public void openURL(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
	}
	public void click(String str) throws Exception{
		driver.findElement(By.linkText(str)).click();
		Thread.sleep(2000);
	}
	public static void main(String[] args) throws Exception {
		Selenium4Links_Parameter s=new Selenium4Links_Parameter();
		s.openURL();
		s.click("Manual FAQs");
		s.click("Selenium FAQs");
		s.click("Core Java FAQs");
		s.click("Resumes");
	}
}







