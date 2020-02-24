package headLessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	@Test
	public void verifyfacebookTitle()
	{
		WebDriver driver=new HtmlUnitDriver();
		driver.get("http://www.facebook.com");
		String facebook_title=driver.getTitle();
		Assert.assertTrue(facebook_title.contains("facebook"));
	}
}
