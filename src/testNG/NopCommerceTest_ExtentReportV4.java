package testNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NopCommerceTest_ExtentReportV4 {
	
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setExtent(){
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myExtentReport.html");
		
		htmlReporter.config().setDocumentTitle("Automation Report"); //Title of Report
		htmlReporter.config().setReportName("Functional Report"); //Name of the Report
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		
		extent.setSystemInfo("Host Name", "LocalHost");
		extent.setSystemInfo("OS", "Windows7");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Basant");
		extent.setSystemInfo("Browser", "Chrome");
		
		
	}
	@AfterTest
	public void endReport(){
		extent.flush();
	}
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.nopcommerce.com/");
	}
	@Test
	public void nopCommerceTitleTest(){
		test = extent.createTest("nopCommerceTitleTest");
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "nopCommerce demo store");
		
	}
	@Test
	public void nopCommerceLogTest(){
		test = extent.createTest("nopCommerceLogoTest");
		
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertTrue(status);
		
	}
	@Test
	public void nopCommerceLoginTest(){
		test = extent.createTest("nopCommerceLogoTest");
		Assert.assertTrue(true);
		
	}
	@AfterMethod
	public void getResult(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE){
			test.log(Status.FAIL, "Test Case Failed is : "+result.getName());
			test.log(Status.FAIL, "Test Case Failed is : "+result.getThrowable());
			
			String screenshotPath = NopCommerceTest_ExtentReportV4.getScreenshot(driver, result.getName());
			
			test.addScreenCaptureFromPath(screenshotPath);
			
		}
		else if(result.getStatus()==ITestResult.SKIP){
			test.log(Status.SKIP, "Test  Case Skipped is : "+result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			test.log(Status.PASS, "Test  Case Passed is : "+result.getName());
		}
		
		
	}
	private static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destination = System.getProperty(("user.dir") + "Screenshots/" + screenshotName + dateName + ".png");
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		
		return destination;
	}

}

