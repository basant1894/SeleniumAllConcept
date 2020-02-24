package handleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow1 {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/");

		String parent=driver.getWindowHandle();
		System.out.println("Parent window id is "+parent);

		driver.findElement(By.xpath(".//*[@id='post-body-6170641642826198246']/a[1]")).click();

		Set<String> allWindows=driver.getWindowHandles();

		int count=allWindows.size();
		System.out.println("Total window "+count);

		for(String child:allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);

				driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
				Thread.sleep(3000);

				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Parent window title "+driver.getTitle());


	}

}
