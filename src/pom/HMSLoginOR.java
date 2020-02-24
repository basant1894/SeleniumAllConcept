package pom;

import org.openqa.selenium.By;

public class HMSLoginOR {

	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='password']");
	By login=By.xpath("//input[@name='submit']");
	By registration=By.linkText("Registration");
	By permanentRegistration=By.linkText("Permanent Registration");
}
