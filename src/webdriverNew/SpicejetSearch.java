package webdriverNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetSearch {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
		driver.findElement(By.linkText("Desktop Site")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		driver.findElement(By.linkText("15")).click();
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("3 Adults");
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("2 Children");
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1 Infant");
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}








