package webdriverNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetSearch_Parameter_8to11 {
	private WebDriver driver;
	public void openURL(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
		driver.findElement(By.linkText("Desktop Site")).click();	
	}
	public void search(String a,String c,String i) throws Exception{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		driver.findElement(By.linkText("15")).click();
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText(a);
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText(c);
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText(i);
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();	
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(2000);
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SpicejetSearch_Parameter_8to11 s=new SpicejetSearch_Parameter_8to11();
		s.openURL();
		s.search("1 Adult", "0 Children", "0 Infant");
		s.search("3 Adults", "1 Child", "0 Infant");
		s.search("4 Adults", "2 Children", "1 Infant");
		s.search("6 Adults", "3 Children", "2 Infants");
	}

}
