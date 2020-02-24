package webdriverNew;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import jxl.Workbook;
import seleniumBasic.TakeScreenShort;

public class AllSeleniumInterviewQuestions<TakeScreenshort> {
	WebDriver driver;
	
	public boolean isAlertPresent(){
		try{
			driver.switchTo().alert();
			return true;
		}catch (Exception e) {
			return false;
		}
	}
		
	@Test
	public void AllQuestion() throws IOException{
		driver=new ChromeDriver();
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		Alert text= driver.switchTo().alert();
		System.out.println(text.getText());
		
		System.out.println("***********************");
		
		driver.switchTo().frame(0); //based on index
		driver.switchTo().frame("frame"); // based on Name
		//driver.switchTo().frame(driver.findElement(By.xpath(""))); //based on element
		
		System.out.println("***********************");
		
		String pwindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> allwindow=allWindows.iterator();
		String ParentWindow=allwindow.next();
		driver.switchTo().window(ParentWindow);
		String ChildWindow=allwindow.next();
		driver.switchTo().window(ChildWindow);
		driver.switchTo().defaultContent();
		
		System.out.println("***********************");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		System.out.println("**********************");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		
		System.out.println("**********************");
		
		Select sel=new Select(driver.findElement(By.xpath("")));
		sel.selectByIndex(5); //select by Index
		sel.selectByValue("value"); //by value
		sel.selectByVisibleText("text"); //select by visibletext
		
		System.out.println("***********************");
		
		Actions action=new Actions(driver);
		WebElement source = driver.findElement(By.xpath(""));
		WebElement target = driver.findElement(By.xpath(""));
		action.dragAndDrop(source, target);
		
		System.out.println("************************");
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D:\\screenshot\\login"+".png"));
		
		System.out.println("***********************");
		
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		
		Point Position=driver.manage().window().getPosition();
		Position.getX();
		Position.getY();
		
		System.out.println("************************");
		
		driver.navigate().forward();
		driver.navigate().back();
		
		System.out.println("***********************");
		
		String curl = driver.getCurrentUrl();
		driver.getTitle();
		
		System.out.println("***********************");
		 //how do you read data from excel
		FileInputStream input= new FileInputStream("path of the file");
		
	}

}
