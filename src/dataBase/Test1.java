package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 { 
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
	    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","basu");
	    System.out.println("Connected to MySQL DB");
	    
	    Statement smt=con.createStatement();
	    
	    //Execute sql statement
	    String s = "SELECT uname,password FROM mercury";
	    
	    ResultSet rs = smt.executeQuery(s);
	    
	    while(rs.next()){
	    	
	    	String username = rs.getString("uname");
	    	String password = rs.getString("password");
	    	
	    	System.out.print(username); //System.out.print(username+" ");
	    	System.out.println(password);
	    	
	    	driver.findElement(By.name("userName")).sendKeys(username);
	    	driver.findElement(By.name("password")).sendKeys(password);
	    	driver.findElement(By.name("login")).click();
	    	
	    	//Validation
	    	if(driver.getTitle().equals("Find a Flight: Mercury Tours:")){
	    		
	    		System.out.println("Test Case Passed");
	    	}
	    	else{
	    		System.out.println("Test Case Failed");
	    	}
	    	driver.findElement(By.linkText("Home")).click();
	  
	    }
	    	con.close();	
	    	
	    }
		
	}


