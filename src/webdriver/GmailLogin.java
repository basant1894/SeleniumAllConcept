package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("basant1894@gmail.com");
		driver.findElement(By.id(".//*[@id='identifierNext']/content/span")).click();
		driver.findElement(By.name("password")).sendKeys("maababuji@basu");
		driver.findElement(By.id(".//*[@id='passwordNext']/content/span")).click();
		
	}

}
