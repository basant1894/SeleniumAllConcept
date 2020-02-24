package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestScript_PR {

	HMSHomePageComponents homepage=new HMSHomePageComponents();
	
  @Test(description="Verify the patient entry functionality of PR in HMS")
  public void test01() throws Exception  {
	  homepage.launchURL();
	  homepage.login();
	  homepage.navigateToPR();
	  homepage.createPatient();
  }

  

}
