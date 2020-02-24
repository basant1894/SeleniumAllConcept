package javaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JScriptDemo {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		//Flashing
		WebElement joinfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
		JavaScriptUtils.flash(joinfree, driver);
		
		//Drawing Border
		//JavaScriptUtils.drawBorder(joinfree, driver);
		
		//Take the ScreenShot of Drawing Area
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("C:\\Git\\git\\TestProject\\AutomationTesting\\Screenshots\\twoplugs.png"));
		
		//Capture Title of page by using JS
		//String title = JavaScriptUtils.getTitleByJS(driver);
		//System.out.println(title);
		
		//Clicking on element
		//WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
		
		//JavaScriptUtils.clickElementByJS(loginBtn, driver);
		
		//Generate Alert
		//JavaScriptUtils.generatAlert(driver, "You Clicked on login Button");
		
		//Refreshing Page
		//JavaScriptUtils.refreshBrowserByJS(driver);
		
		//Scroll down the page till we found element
		//WebElement image = driver.findElement(By.xpath("//*[@id='rslides3_s0']/div[1]/img"));
		//JavaScriptUtils.scrollIntoView(image, driver);
		
		//scroll down page till end
		//JavaScriptUtils.scrollPageDown(driver);
	}

}
