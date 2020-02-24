package displayed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSortedORNot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("animals"));
		Select se = new Select(element);

		List originalList = new ArrayList();

		List<WebElement> options=se.getOptions();

		for(WebElement e:options){

			originalList.add(e.getText());
		}
		System.out.println(originalList);

		//creating temlist
		List tempList = new ArrayList();

		tempList = originalList;

		System.out.println("Before Sorting tem list: "+tempList);

		Collections.sort(tempList);
		System.out.println("After Sorting tem list: "+tempList);

		//comparing both list
		if(originalList == tempList ){
			System.out.println("DropDown Sorted");
		}
		else
		{
			System.out.println("DropDown Not Sorted");
		}	
	}
}


