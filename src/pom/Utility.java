package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Utility {

	WebDriver driver;
	public void openBrowser(){
		 System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		  driver=new ChromeDriver();
	}
	public void openURL(String url){
		 driver.get(url);
	}
	
	public void type(By loc,String data){
		driver.findElement(loc).sendKeys(data);
	}
	public void click(By loc){
		driver.findElement(loc).click();
	}
	public void select(By loc,String data){
		new Select(driver.findElement(loc)).selectByVisibleText(data);
	}
	public void waitforObject(int time) throws Exception{
		Thread.sleep(time);
	}
	public static void captureScreenshot(WebDriver driver2, String name) {
		// TODO Auto-generated method stub
		
	}
	
}
