package spicejet_testNG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DBConnections {
	public Connection conn;
	public Statement stat;
	public ResultSet rs;
	String str;
	public void dbconnection() throws Exception{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn=DriverManager.getConnection("jdbc:sqlserver://Basu-PC;databasename=Spicejet","sa","sa@123");
		stat=conn.createStatement();
		rs=stat.executeQuery("select * from EMP where Name='Basu'");
		while(rs.next()){
			str=rs.getString("Name");
			System.out.println("Id");
			System.out.println(str);
			System.out.println(rs.getInt("Salary"));
		}
		}
	
  @Test
  public void f() throws Exception {
	  dbconnection();
	  
  }
}
