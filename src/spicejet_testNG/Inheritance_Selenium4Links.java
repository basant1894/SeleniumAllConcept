package spicejet_testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Inheritance_Selenium4Links extends CaptureScreenShot{
  @Test
  public void verifyGTFAQs() throws Exception {
	 driver.findElement(By.linkText("General Testing FAQs")).click();
	 takeScreenShot("gtFAQs");
  }
}
