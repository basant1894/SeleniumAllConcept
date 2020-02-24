package webdriverNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HMS_PR_ER_Admission {
	public WebDriver driver;
	public void openurl(){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/hms");	
	}
	public void login(){	
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
	}
	public void reg(){
		driver.findElement(By.linkText("Registration")).click();
	}
	public void pr(){
		driver.findElement(By.linkText("Permanent Registration")).click();
	}
	public void fld(){
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("Ramanamma");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Pullarao");
		// driver.findElement(By.name("MIDDLE_NAME")).sendKeys("H");
		driver.findElement(By.name("LAST_NAME")).sendKeys("G");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("AP02864554");
		driver.findElement(By.name("DOB")).sendKeys("20-01-1991");
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		driver.findElement(By.name("AGE")).sendKeys("25");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("A+");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		driver.findElement(By.name("ADDRESS1")).sendKeys("Kandukur");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("7382232315");
		driver.findElement(By.name("ZIP")).sendKeys("523105");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		driver.findElement(By.name("image")).sendKeys("E:\\Photos\\Indian.png");
		
		
	}
	public void er(){
		driver.findElement(By.linkText("Emergency Registration")).click();
	}
	public void erFilds(){
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Pay Patient");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Malakonda");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Voter ID");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("AP0000142");
		driver.findElement(By.name("AGE")).sendKeys("25");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		driver.findElement(By.name("image")).sendKeys("E:\\Photos\\Indian.png");
	}
	public void adtreg(){
		driver.findElement(By.linkText("ADT")).click();
	}
	public void adtfields(){
		driver.findElement(By.name("PNT_ID")).sendKeys("612345");
		driver.findElement(By.name("MR_NO")).sendKeys("PR4673363729");
		driver.findElement(By.name("BOOKING_ID")).sendKeys("Malakonda");
		driver.findElement(By.name("REQ_ID")).sendKeys("612345");
		new Select(driver.findElement(By.name("ADM_TPYE"))).selectByVisibleText("Others");
		driver.findElement(By.name("EXP_DATE")).sendKeys("01-02-2017");; //EXP
		new Select(driver.findElement(By.name("PNT_CLASS"))).selectByVisibleText("ICU");
		driver.findElement(By.name("EXP_STAY_DATE")).sendKeys("5");
		new Select(driver.findElement(By.name("EXP_STAY_FORMAT"))).selectByVisibleText("Weeks");
		new Select(driver.findElement(By.name("INSU_PLAN"))).selectByVisibleText("Yes");
		driver.findElement(By.name("EXP_DISCHARGE_DATE")).sendKeys("01-03-2017");
		new Select(driver.findElement(By.name("ADM_SOURSE"))).selectByVisibleText("ICU");
		new Select(driver.findElement(By.name("HOSPITAL_SERVICES"))).selectByVisibleText("Scanning");
		new Select(driver.findElement(By.name("DOC_NAME"))).selectByVisibleText("Sai");
		new Select(driver.findElement(By.name("HOSPITAL_SUB_SERVICES"))).selectByVisibleText("X-Ray");
		new Select(driver.findElement(By.name("DOC_SPL"))).selectByVisibleText("cordialagist");
		driver.findElement(By.name("PRMRY_CONSULT")).sendKeys("SaiKumar");
		new Select(driver.findElement(By.name("ADD_DOC_SPL"))).selectByVisibleText("Cordialagist");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		     // ASSIGN BED DETAILS
		new Select(driver.findElement(By.name("BED_CLASS"))).selectByVisibleText("A/C");
		new Select(driver.findElement(By.name("ADM_BED_CLASS"))).selectByVisibleText("A/C");
		new Select(driver.findElement(By.name("BED_NUM"))).selectByVisibleText("BED-2");
		new Select(driver.findElement(By.name("NURSING_STATION"))).selectByVisibleText("Rani");
		new Select(driver.findElement(By.name("WARD_NUM"))).selectByVisibleText("9");
			// ADDITIONAL STATUS
		new Select(driver.findElement(By.name("AMBULATORY_STATUS"))).selectByVisibleText("Ambulance");
		new Select(driver.findElement(By.name("MODE_ARRIVAL"))).selectByVisibleText("With Family Members");
			// PATIENT VALUBLES
		new Select(driver.findElement(By.name("CAPTURED_BY"))).selectByVisibleText("Admin");
		driver.findElement(By.name("CAPTURED_DATE")).sendKeys("01-03-2017");
		driver.findElement(By.name("submit")).click();
	}
	public void logout(){
		driver.findElement(By.linkText("Logout")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HMS_PR_ER_Admission h=new HMS_PR_ER_Admission();
		h.openurl();
		h.login();
		h.reg();
		h.pr();
		h.fld();
		h.er();
		h.erFilds();
		h.adtreg();
		h.adtfields();

	}

}
