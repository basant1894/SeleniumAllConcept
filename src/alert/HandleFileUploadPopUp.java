package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			//driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("http://html.com/input-type-file/");
			Thread.sleep(6000);
			
			driver.findElement(By.xpath("/html/body")).click();
			
			//Alert alt=driver.switchTo().alert();
			//alt.dismiss();
			
			driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Admin\\Desktop\\MixFile\\Test3");
	}

}
