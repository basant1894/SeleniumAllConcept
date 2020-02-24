package demoRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MercuryTourReg {
	WebDriver driver;
	
	@Test
	public void contactInfo(){
	driver.findElement(By.name("firstName")).sendKeys("Basant");
	driver.findElement(By.name("lastName")).sendKeys("chaudhary");
	driver.findElement(By.name("phone")).sendKeys("9776698977");
	driver.findElement(By.name("userName")).sendKeys("basant1894@gmail.com");
	driver.findElement(By.name("address1")).sendKeys("dist-Garhwa,Jharkhand");
	driver.findElement(By.name("city")).sendKeys("Garhwa");
	driver.findElement(By.name("state")).sendKeys("Jharkhand");
	driver.findElement(By.name("postalCode")).sendKeys("822124");
	
	new Select(driver.findElement(By.name("country"))).selectByVisibleText("INDIA");
	
	/*//Selecting Items in a Multiple SELECT elements
	driver.get("http://jsbin.com/osebed/2");
	Select fruits = new Select(driver.findElement(By.id("fruits")));
	fruits.selectByVisibleText("Banana");
	fruits.selectByIndex(1);*/
		
	}
	@BeforeTest
	public void login(){
	System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	}
	@AfterTest
	public void closes(){
		driver.quit();
		
	}

}
