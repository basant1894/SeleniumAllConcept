package alert;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopUp {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		
		String homePage = driver.getWindowHandle();
		System.out.println(homePage);
		
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		
		/*String poUpPage = driver.getWindowHandle();
		System.out.println(poUpPage);*/
		
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
		
		Iterator itr = windows.iterator();
		
		while(itr.hasNext()){
			String currentWindowId = itr.next().toString();
			System.out.println(currentWindowId);
			
			if(!currentWindowId.equals(homePage)){
				driver.switchTo().window(currentWindowId);
				//Thread.sleep(3000);
				//driver.close();
				
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
			Thread.sleep(3000);
			driver.close();
			
			
			}
		}	
	}
}
