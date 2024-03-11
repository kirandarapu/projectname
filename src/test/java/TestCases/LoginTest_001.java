package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import junit.framework.Assert;

public class LoginTest_001 extends BaseClass {   //child class

	@Test
	public void logintest() throws InterruptedException, IOException  {
		
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		log.info("username is enetered");
		Thread.sleep(3000);//intervals
		lp.setPassword(password);
		log.info("password is enetered");
		Thread.sleep(3000);
		lp.ClickLoginbtn();
		log.info("user is succefully logging inito the account");
	
	String exp_result="Adactin.com - Search Hotel";
	String act_result=driver.getTitle();
	
	if(act_result.equals(exp_result)) {
		
		Assert.assertTrue(true);//hard asserts
		
		log.info("testcase is pass");
	}
	else {
		
		captureScreen(driver,"logintest");
		Assert.assertTrue(false);
		
		log.info("testcase is failed");
	}
	
    
	
	
	
	}
}
