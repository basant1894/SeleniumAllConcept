package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMSLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	webdriver driver=new chromedriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium4testing.com/hms");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();

	}

}




