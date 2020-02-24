package configurationDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());
		
		for(int i=0; i<links.size(); i++){
			WebElement ele=links.get(i);
			String url=ele.getAttribute("href");
			
				verifyLinkActive(url);
		}
	}
	public static void verifyLinkActive(String linkUrl) throws IOException {
		try {	
		 URL url = new URL(linkUrl);
		 HttpURLConnection httpURLConnection= (HttpURLConnection)url.openConnection();
		 
		 httpURLConnection.setConnectTimeout(3000);
		 
		 httpURLConnection.connect();
		 
		 if(httpURLConnection.getResponseCode()==200){
			 System.out.println(linkUrl+" - "+httpURLConnection.getResponseMessage());
		 }
		 if(httpURLConnection.getResponseCode()==httpURLConnection.HTTP_NOT_FOUND){
			 System.out.println(linkUrl+" - "+httpURLConnection.getResponseMessage() + " - "+httpURLConnection.HTTP_NOT_FOUND);	 
		 } 
		 
		}catch(Exception e){
			
		}
	}
}
