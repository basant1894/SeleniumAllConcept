package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	webdriver driver=new chromedriver();
System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //Open Chrome Browser
		driver.get("http://selenium4testing.com/hms/"); //Opens URL
		
		
	}

}
