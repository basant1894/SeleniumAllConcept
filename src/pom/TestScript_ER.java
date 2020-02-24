package pom;

import org.testng.annotations.Test;

public class TestScript_ER {
	HMSHomePageComponents homepage=new HMSHomePageComponents();
  @Test
  public void f() throws Exception {
	  homepage.launchURL();
	  homepage.login();
	  homepage.navigateToER();
	  homepage.createpatintinER();
  }
}
