package displayed;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountCkeckedAndUnchecked_Checkboxes {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	
	driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	//driver.findElement(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label//input[@value='jQuery']")).click();
	//driver.findElement(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label//input[@value='Bootstrap']")).click();
	
	List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
	 System.out.println(list.size());
	 
	 int checkedCount = 0;
	 int uncheckedCount = 0;
	 
	 for(int i=0; i<list.size(); i++) {
		 if(list.get(i).isSelected()==true) 
			 checkedCount++;
			 
			 else
				 uncheckedCount++;
		 }
	 System.out.println("No of checked checkboxes :"+checkedCount);
	 System.out.println("No of Unchecked checkboxes :"+uncheckedCount);
		 
	 }
}


