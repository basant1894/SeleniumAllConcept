package configurationDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("basant1894");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kuku0011");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		
		//Get the links of all the href and images
		List<WebElement> linkslist= driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of all links and images= "+linkslist.size());

		
		List<WebElement> activelinks=new ArrayList<WebElement>();
		
		//Iterate linkslist:
		for (int i = 0; i < linkslist.size(); i++){
			
			System.out.println(linkslist.get(i).getAttribute("href"));
			
			if (linkslist.get(i).getAttribute("href") !=null && (!linkslist.get(i).getAttribute("href").contains("javascript"))) {
				activelinks.add(linkslist.get(i));
				
			}
		}
		//get the size of active links:
			System.out.println("Size of active links and images= "+activelinks.size());
			
			//check the href url, with httpconnnection api:
			for(int j=0; j<activelinks.size(); j++){
				HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
				
				connection.connect();
				String response= connection.getResponseMessage(); //ok
				connection.disconnect();
				System.out.println(activelinks.get(j).getAttribute("href")+"...>"+response);	
			}
	}

}
