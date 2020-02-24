package dataDrivenFW;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryToursRegistration {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
        FileInputStream fis = new FileInputStream("D:\\Basant\\ExcelData\\registration.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("Sheet1");
		
		int TotalrowNum = s.getLastRowNum();
		System.out.println("Toal Number of Rows :" +TotalrowNum);
		
		for (int row = 1; row <= TotalrowNum; row++) {
			
			//String current_Row = s.getRow(row).getCell(0).getStringCellValue();
			XSSFRow current_Row = s.getRow(row);
			
			String First_Name = current_Row.getCell(0).getStringCellValue();
			String Last_Name = current_Row.getCell(1).getStringCellValue();
			String Phone = current_Row.getCell(2).getStringCellValue();
			String Email = current_Row.getCell(3).getStringCellValue();
			String Address = current_Row.getCell(4).getStringCellValue();
			String City = current_Row.getCell(5).getStringCellValue();
			String State = current_Row.getCell(6).getStringCellValue();
			String PostalCode = current_Row.getCell(7).getStringCellValue();
			String Country = current_Row.getCell(8).getStringCellValue();
			String UserName = current_Row.getCell(9).getStringCellValue();
			String Password = current_Row.getCell(10).getStringCellValue();
			
			//Click on Registration Link
			driver.findElement(By.linkText("REGISTER")).click();
			
			//Entering Contact Information
			driver.findElement(By.name("firstName")).sendKeys(First_Name);
			driver.findElement(By.name("lastName")).sendKeys(Last_Name);
			driver.findElement(By.name("phone")).sendKeys(Phone);
			driver.findElement(By.name("userName")).sendKeys(Email);
			
			//Entering Mailing Info
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("address2")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(PostalCode);
			
			//Country Selection
			WebElement nation = driver.findElement(By.name("country"));
			
			org.openqa.selenium.support.ui.Select country = new org.openqa.selenium.support.ui.Select(nation);
			country.deselectByVisibleText(Country);
			
			//Entering user info
			driver.findElement(By.name("email")).sendKeys(UserName);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Password);
			
			//Submiting form 
			driver.findElement(By.name("register")).click();
			
			if(driver.getPageSource().contains("Than you for registerin")){
				System.out.println("Registration Completed for " +row+ "record");
			}
			
			else{
				System.out.println("Registration Failed for " +row+ "record");
			}	
		}
		System.out.println("Data Driver Completed for ");
		driver.close();
		driver.quit();
		
		fis.close();
	}

}
