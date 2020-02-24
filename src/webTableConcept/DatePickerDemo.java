package webTableConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        driver.findElement(By.xpath("//input[@id='src']")).click();
        driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Bangalore");
	}

}
