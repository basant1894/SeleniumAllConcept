package webdriverNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	private WebDriver driver;
	public void openURL(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://gmail.com");	
	}
	public void login(){
		driver.findElement(By.id("Email")).sendKeys("testingse2");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("selenium1");
		driver.findElement(By.id("signIn")).click();	
	}
	public void logout(){
		driver.findElement(By.cssSelector("span.gb_9a.gbii")).click();
		driver.findElement(By.id("gb_71")).click();	
	}

	public static void main(String[] args) {
		GmailLogin g=new GmailLogin();
		g.openURL();
		g.login();
		g.logout();
	
	}
}
