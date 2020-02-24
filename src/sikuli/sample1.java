package sikuli;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class sample1 {
	Screen s=new Screen();
  @Test
  public void f() throws Exception {
	 // s.click("D:\\Workspace6\\images.sikuli\\1491114541151.png");
	  if(s.exists("D:\\Workspace6\\images.sikuli\\1491114541151.png") != null)
	  {
		  System.out.println("Available");
		  s.click("D:\\Workspace6\\images.sikuli\\1491114541151.png");
	  }else{
		  System.out.println("Not Available");
	  }
  }
}
