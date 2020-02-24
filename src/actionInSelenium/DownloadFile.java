package actionInSelenium;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class DownloadFile {

	WebDriver driver;
	File folder;
	private Object file;
	private Object not;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp(){
		//88888-99999-777777-66666-55555
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();

		//chrome
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();

		Map<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", folder.getAbsolutePath());

		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);

		driver=new ChromeDriver(cap);
	}
	@Test
	public void downloadFile() throws InterruptedException{
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();

		Thread.sleep(2000);
		File listOfFiles[]=folder.listFiles();
		//Assert.assertEquals(listOfFiles.length, is(not)));

		Assert.assertTrue(listOfFiles.length>0);

		for(File file:listOfFiles){
			Assert.assertTrue(file.length()>0);

		}

	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
		for(File file : folder.listFiles());
		((File) file).delete();
		//}
		folder.delete();



	}
}
