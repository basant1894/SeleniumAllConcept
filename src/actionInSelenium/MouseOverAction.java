package actionInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("https://www.myntra.com/login/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[4]/div/div/div[1]/a/h3")).click();
		//Thread.sleep(4000);
		
		/*String mainPage = driver.getWindowHandle();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());  
		alt.dismiss();
		driver.switchTo().window(mainPage);*/
		
		WebElement ele=driver.findElement(By.linkText(".//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/a"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}

}
