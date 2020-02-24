package displayed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FontTest {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
		
	}
	@Test
	public void readFontProperty(){
		
		//Locate text string element to read It's font properties
		WebElement text = driver.findElement(By.xpath("//h1[contains(.,'Example Login Page')]"));
		
		//Read font-size property and print it in console
		String fontSize = text.getCssValue("font-size");
		System.out.println("Font Size -> "+fontSize);
		
		//Read color property and print it in console
		String fontColor = text.getCssValue("color");
		System.out.println("Font Color -> "+fontColor);
		
		//Read font-family property and print it in console
		String fontFamily = text.getCssValue("font-family");
		System.out.println("Font Family -> "+fontFamily);
		
		//Read text-align property and print it in console
		String fonttxtAlign = text.getCssValue("font-family");
		System.out.println("Font Text Align -> "+fonttxtAlign);
	}

}
