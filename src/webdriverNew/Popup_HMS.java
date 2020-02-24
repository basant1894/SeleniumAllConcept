package webdriverNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Popup_HMS {
	WebDriver driver;
	public void openURL(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/hms");
	}
	public void login(){
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();	
	}
	public void verifyPopup() throws Exception{
		String str=driver.getWindowHandle();
		driver.findElement(By.linkText("Feedback")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window("mywindow");
		driver.findElement(By.id("name")).sendKeys("Testing");
		driver.findElement(By.id("email")).sendKeys("testingse2@gmail.com");
		new Select(driver.findElement(By.id("car"))).selectByVisibleText("Mercedes");
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(str);
		
		driver.findElement(By.linkText("ADT")).click();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Popup_HMS p=new Popup_HMS();
		p.openURL();
		p.login();
		p.verifyPopup();
	}

}



