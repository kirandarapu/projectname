package TestCases;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PageObjects.RegistrationPage;

public class TC_Register_002 extends BaseClass {

	@Test
	public void RegisterTest() throws InterruptedException {
		
		RegistrationPage rp=new RegistrationPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		rp.clikRegisterLink();
		log.info("link click activity completed");
		rp.setUserUsername(Username);
		log.info("username is entered in registerpage");
		rp.setUserPassword(Password);
		log.info("password is entered in registerpage");
		rp.setConformPassword(Co_password);
		log.info("confirm password is entered in registerpage");
		rp.setFullname(Fullname);
		log.info("fullname is entered in registerpage");
		rp.setEmailAddress(EmailID);
		log.info("EmailAddress is entered in registerpage");
		
		Thread.sleep(13000);
		rp.clickCheckbox();
		rp.clickRegisterbtn();
	}
}
