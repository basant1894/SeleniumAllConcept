package htmlUnitDriver;

import java.lang.reflect.Field;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

public class HtmlunitTest {
	
	public static void main(String[] args) throws Exception, SecurityException, IllegalArgumentException, IllegalAccessException {
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.EDGE);
		driver.get("http://seleniumhq.org/");
		
		System.out.println("Title is : "+driver.getTitle());
		
		WebClient webClient= (WebClient) get(driver, "webClient");
		
		System.out.println("Browser Version is : "+webClient.getBrowserVersion());
		System.out.println("Browser Version Edge : "+webClient.getBrowserVersion().isEdge());
		System.out.println("Browser Version Firefox : "+webClient.getBrowserVersion().isFirefox());
		

		driver.quit();
		
	}
	private static Object get(Object object, String field) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field f=object.getClass().getDeclaredField(field);
		f.setAccessible(true);
		return f.get(object);
	}

}
