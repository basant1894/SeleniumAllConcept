package testNG;

import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Allannotation {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("beforeClass()");
	}
	@Test
	public void test1(){
		System.out.println("test1()");
	}
	@Test
	public void test2(){
		System.out.println("test2");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("afterClass()");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforeMethod()");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod()");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("beforeTest()");
		
	}
	@AfterTest
	public void afterTest(){
		System.out.println("afterTest()");
		
	}
	@BeforeSuite
	public void beforeSuite(){
		System.out.println(" beforeSuite()");
		
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("afterSuite()");
		
    }
}
