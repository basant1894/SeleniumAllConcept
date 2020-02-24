package actionInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com/");
		
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='ctl00_HyperLinkLogin']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		
		WebElement ele1=driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[14]/ul/li[2]/a"));
		action.moveToElement(ele1).build().perform();
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/ul/li[7]/ul/li[1]/ul/li[1]/a")).click();
		
		/*action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("SpiceCash Topup ")).click();
		driver.findElement(By.xpath("//*[@id='header-addons']/ul/li[2]/a")).click();
		// driver.findElement(By.xpath("//*[@id='menu-list-addons']/li[2]/a")).click();*/
		
		
			

	}

}
