package webdriverNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4Links {
	private WebDriver driver;
	
	public void openURL(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
	}
	public void mFAQs() throws Exception{
		try{
			driver.findElement(By.linkText("Manual qwerty")).click();
			Thread.sleep(2000);	
			System.out.println("Pass");
		}catch(Exception e){e.printStackTrace();}
	}
	public void sFAQs() throws Exception{
		try{
			driver.findElement(By.linkText("Selenium FAQs")).click();
			Thread.sleep(2000);	
			System.out.println("Pass");
		}catch(Exception e){System.out.println("Fail");}
	
	}
	public void cFAQs() throws Exception{
		try{
			driver.findElement(By.linkText("Core Java FAQs")).click();
			Thread.sleep(2000);
			System.out.println("Pass");	
		}catch(Exception e){System.out.println("Fail");}
		
	}	

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Selenium4Links s=new Selenium4Links();
		s.openURL();
		s.mFAQs();
		s.sFAQs();
		s.cFAQs();
		
	}

}







