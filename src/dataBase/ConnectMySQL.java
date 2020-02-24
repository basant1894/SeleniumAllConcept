package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySQL {
	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
	    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","basu");
	    
	    System.out.println("Connected to MySQL DB");
	    
	    Statement smt=con.createStatement();
	    
	    ResultSet rs = smt.executeQuery("select * from seleniumuser");
	    
	    while(rs.next()){
	    	String firstname = rs.getString("firstname");
	    	
	    	System.out.println("Database record is: "+firstname);
	    	
           /* String emailaddress=rs.getString("email");
	    	
	    	System.out.println("Email Address is: "+emailaddress);*/
	    }
	}

}
