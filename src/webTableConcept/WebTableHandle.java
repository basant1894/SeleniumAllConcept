package webTableConcept;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");

      
      //*[@id="customers"]/tbody/tr[2]/td[1]
      //*[@id="customers"]/tbody/tr[3]/td[1]
      //*[@id="customers"]/tbody/tr[4]/td[1]
      //*[@id="customers"]/tbody/tr[7]/td[1]
        

        List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount=rows.size();
		System.out.println("Total rows in the web table :" + rowCount);
		
		
        String beforeXpath_Company="//*[@id='customers']/tbody/tr[";
        String afterXpath_Company="]/td[1]";
        
        for(int i=2; i<=rowCount; i++){   //if u knows that how many rows are present in table then u can use: for(int i=2; i<=7; i++){
        	String actualXpath = beforeXpath_Company + i + afterXpath_Company;
        	WebElement element = driver.findElement(By.xpath(actualXpath));
        	System.out.println(element.getText());
        	   if(element.getText().equals("Island Trading")){
        		   System.out.println("Company name : "+ element.getText() + " is found " + "at postion : "+ (i-1));
        		   break;
           }
        }
        System.out.println("***************"); 
      //*[@id="customers"]/tbody/tr[2]/td[2]
      //*[@id="customers"]/tbody/tr[3]/td[2]
        
        String beforeXpath_Contact="//*[@id='customers']/tbody/tr[";
        String afterXpath_Contact="]/td[2]";
        for(int i=2; i<=rowCount; i++) {
        	String actualXpath = beforeXpath_Contact + i + afterXpath_Contact;
        	WebElement element= driver.findElement(By.xpath(actualXpath));
        	System.out.println(element.getText()); 	   
	}
        System.out.println("***************");
	//*[@id="customers"]/tbody/tr[2]/td[3]
    //*[@id="customers"]/tbody/tr[3]/td[3]
        
     String beforeXpath_Country="//*[@id='customers']/tbody/tr[";
	 String afterXpath_Country="]/td[3]";
	 for(int i=2; i<=rowCount; i++){
     	String actualXpath = beforeXpath_Country + i + afterXpath_Country;
     	WebElement element= driver.findElement(By.xpath(actualXpath));
     	System.out.println(element.getText()); 
     }
	 //Handle web table columns:
	//*[@id="customers"]/tbody/tr[1]/th[1]
	//*[@id="customers"]/tbody/tr[1]/th[2]
	//*[@id="customers"]/tbody/tr[1]/th[3]
	 String colBeforeXpath="//*[@id='customers']/tbody/tr[1]/th[";
	 String colAfterXpath="]";
	 List<WebElement> cols= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
	 int colCount=cols.size();
	 System.out.println("Total number of columns are : "+colCount);
	 
	 System.out.println("Columns Values are : ");
	 for (int i = 1; i <=colCount ; i++) {
		 WebElement element= driver.findElement(By.xpath(colBeforeXpath + i + colAfterXpath));
		String colText=element.getText();
		System.out.println(colText);
	}
  }
}
