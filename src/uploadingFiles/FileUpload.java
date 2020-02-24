
package uploadingFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	//WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		
		//Enter the file path onto the file-selection input field
		upload.sendKeys("C:\\Users\\Admin\\Desktop\\FILE\\image\\Basant Cover Letter.docx");
		
		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();
		
		//click on the 'Submit File' button  
		driver.findElement(By.name("send")).click();
	}

}
