package webdriverNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HMS_PR {
	public WebDriver driver;
	public void openURL(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/hms");	
	}
	public void login(){
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();	
	}
	public void registration(){
		driver.findElement(By.linkText("Registration")).click();
	}
	public void pr(){
		driver.findElement(By.linkText("Permanent Registration")).click();	
	}
	public void verifyPR(){
		//Select value from Dropdown
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Insurance");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Father");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");

		driver.findElement(By.name("PNT_NAME")).sendKeys("john");
		//select Date
		driver.findElement(By.name("DOB")).click();
		driver.findElement(By.xpath("//table[@id='tcalGrid']/tbody/tr[3]/td[4]")).click();
		//Upload a file
		driver.findElement(By.name("image")).sendKeys("E:\\Photos\\Indian.png");
		
	//	driver.findElement(By.className("log")).click();
	//	driver.findElement(By.cssSelector("input.log")).click();
/*driver.findElement(By.xpath("//input[@value='Clear']")).click();
driver.findElement(By.xpath("//input[@class='log' and @value='Clear']")).click();
driver.findElement(By.xpath("//input[@class='log' or @value='Clear']")).click();*/
driver.findElement(By.xpath("html/body/div[2]/div/div[2]/form/div[1]/table/tbody/tr[18]/td[3]/input")).click();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HMS_PR h=new HMS_PR();
		h.openURL();
		h.login();
		h.registration();
		h.pr();
		h.verifyPR();
	}

}






