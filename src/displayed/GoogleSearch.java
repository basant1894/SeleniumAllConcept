package displayed;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("altr");
		Thread.sleep(1000);
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++){
			
			String listitem=list.get(i).getText();
			
			if(listitem.contains("altran")){
				list.get(i).click();
				break;
				
				
			}
		}
	}

}
