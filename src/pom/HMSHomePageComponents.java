package pom;

public class HMSHomePageComponents extends Utility{
	HMSLoginOR loginOR=new HMSLoginOR();
	HMSPROR prOR=new HMSPROR();
	HMSEROR erOR=new HMSEROR();
	public void launchURL(){
		openBrowser();
	  	openURL("http://selenium4testing.com/hms");
	}
	public void login() throws Exception{	
	  	type(loginOR.username,"admin");
	  	type(loginOR.password,"admin");
	  	click(loginOR.login);
	  	waitforObject(2000);
	}
	public void navigateToPR(){
		  click(loginOR.registration);
		  click(loginOR.permanentRegistration);
	}
	public void createPatient(){
		  select(prOR.patientCategory, "Staff");
		  select(prOR.relation, "Father");
		  select(prOR.title, "Mr.");
	}
	public void navigateToER(){
		click(loginOR.registration);
		click(erOR.emergencyRegistration);
	}
	public void createpatintinER(){
		type(erOR.firstName, "John");
		type(erOR.lastName, "Rao");
	}

}







