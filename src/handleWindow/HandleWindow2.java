package handleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");

		String parent=driver.getWindowHandle();
		System.out.println("Parent window id is "+parent);

		driver.findElement(By.xpath("//a[contains=(@href,'http://www.google.com')]")).click();

		Set<String> allWindows=driver.getWindowHandles();

		int count=allWindows.size();
		System.out.println("Total window "+count);

		for(String child:allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				System.out.println("Child window title is "+driver.getTitle());

				driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
				Thread.sleep(3000);

				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Parent window title "+driver.getTitle());


	}
		
	}


