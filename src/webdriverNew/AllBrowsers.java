package webdriverNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AllBrowsers {
	//WebDriver Drivers
	//https://github.com/mozilla/geckodriver/releases  --Gecko Driver
	//http://docs.seleniumhq.org/download/  --IE Driver
	public WebDriver driver;
	public void chrome(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com");
	}
	public void firefox(){
		System.setProperty("webdriver.gecko.driver", "D:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://selenium4testing.com");
	}
	public void ie(){
		System.setProperty("webdriver.ie.driver", "D:\\Library\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://selenium4testing.com");
	}
	public void safari(){
		driver=new SafariDriver();
		driver.get("http://selenium4testing.com");	
	}
	public void opera(){
		driver=new OperaDriver();
		driver.get("http://selenium4testing.com");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllBrowsers a=new AllBrowsers();
		//a.firefox();
		//a.ie();
		a.safari();
	}

}




