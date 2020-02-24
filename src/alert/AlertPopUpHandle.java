package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert= driver.switchTo().alert();
		alert.getText();
		System.out.println(alert.getText());
		
		String text= alert.getText();
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		}
			else {
				System.out.println("In-correct alert message");
	    }
		alert.accept();
	}
}


