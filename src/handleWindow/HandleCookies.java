package handleWindow;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookies {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		Set <Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of Cookies :"+cookies.size());

		for(Cookie cookie:cookies){

			System.out.println(cookie.getName()+":"+cookie.getValue()); 
			//System.out.println(driver.manage().getCookieNamed("session-token"));//print specific cookie according to name

			//Add new cookie to browser
			/*Cookie cobj = new Cookie("mycookie","124587935");
			driver.manage().addCookie(cobj);

			System.out.println("New Size of Cookie :"+cookies.size());
			for(Cookie cookie:cookies){

			System.out.println(cookie.getName()+":"+cookie.getValue());*/
		}
	}
}
