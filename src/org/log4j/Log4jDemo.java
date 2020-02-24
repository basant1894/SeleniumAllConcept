package org.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger=Logger.getLogger("Log4jDemo");
		
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		logger.info("chrome opened");
		
		driver.manage().window().maximize();
		logger.info("Browser maximized");
		
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		logger.info("App Launched");
		
		driver.findElement(By.name("email")).sendKeys("basubasant94@gmai.com");
		driver.findElement(By.name("password")).sendKeys("kuku0011");
		driver.findElement(By.className("//button[@title='Log in']")).click();
		logger.info("Navigat to HomePage");
		
		String actual_msg=driver.switchTo().alert().getText();
		logger.info("Capture the text");
		
		System.out.println("Alert msg is"+actual_msg);
		
		driver.switchTo().alert().accept();
		logger.info("Accept the Window");
		
		
		
		

	}

}
