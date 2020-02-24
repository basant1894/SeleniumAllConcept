package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginRetesting_Results {
	WebDriver driver;
	String str;

	@Test
	public void loginRetestingWithResults() throws Exception {
		//TimeStamp
		SimpleDateFormat df=new SimpleDateFormat("yyyy_MM_dd hh_mm_ss a");
		Date d=new Date();
		String time=df.format(d);
		System.out.println(time);
		//Read the input data form the testdata file	 
		FileInputStream fi = new FileInputStream(".\\TestData\\Login.xls");
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet("LoginData");
		//Crate the Result file under the Result folder
		FileOutputStream fo = new FileOutputStream(".\\Results\\LoginResults"+time+".xls");
		WritableWorkbook wb = Workbook.createWorkbook(fo);
		WritableSheet ws = wb.createSheet("Results", 0);

		for (int i = 1; i < s.getRows(); i++) {
			//Enter username and password by taking data from testdata file	
			driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
			driver.findElement(By.name("submit")).click();
			//Validate signout, if available Assign pass to str else assign Fail to str
			try{
				driver.findElement(By.linkText("Logout")).click();	
				System.out.println("Pass");
				str="Pass";
			}catch(Exception e){
				str="Fail";
				System.out.println("Fail");
				driver.switchTo().alert().accept();
			}
			//Add the str value under the Result column
			Label result = new Label(2, i, str);
			ws.addCell(result);
			//Add Input data to the Result file
			for (int j = 0; j < s.getColumns(); j++) {
				System.out.println(s.getCell(j, i).getContents());
				Label l = new Label(j, i, s.getCell(j, i).getContents());
				ws.addCell(l);
			}
		}
		//Add the 3 Labels
		Label un = new Label(0, 0, "Username");
		ws.addCell(un);
		Label pw = new Label(1, 0, "Password");
		ws.addCell(pw);
		Label rs = new Label(2, 0, "Result");
		ws.addCell(rs);
		//Write and close the result file
		wb.write();
		wb.close();

	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://selenium4testing.com/hms");
	}

}
