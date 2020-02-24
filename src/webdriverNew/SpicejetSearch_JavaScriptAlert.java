package webdriverNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetSearch_JavaScriptAlert {
	WebDriver driver;
	public void openURL(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
		driver.findElement(By.linkText("Desktop Site")).click();	
	}
	public void search() throws Exception{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		driver.findElement(By.linkText("15")).click();
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("6 Adults");
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("4 Children");
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1 Infant");
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
Thread.sleep(2000);
	}
	public void verifyAlert(){
		String str;
		str=driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept(); //To click Ok
		driver.switchTo().alert().dismiss();; //To click cancel
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SpicejetSearch_JavaScriptAlert s=new SpicejetSearch_JavaScriptAlert();
		s.openURL();
		s.search();
		s.verifyAlert();
	}

}







