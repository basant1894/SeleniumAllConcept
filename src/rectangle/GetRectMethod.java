package rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationWorkspace\\AutomationTesting\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		//Selenium-3
		Dimension loginBtnDimension = loginButton.getSize();
		System.out.println(loginBtnDimension.getHeight());
		System.out.println(loginBtnDimension.getWidth());

		Point p=loginButton.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		//Selenium-4
		Rectangle loginBtnRec=loginButton.getRect();
		System.out.println(loginBtnRec.getHeight());
		System.out.println(loginBtnRec.getWidth());
		
		System.out.println(loginBtnRec.getX());
		System.out.println(loginBtnRec.getY());
		
		
	}

}
