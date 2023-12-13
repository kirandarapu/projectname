package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	public WebDriver driverr;
	
	public RegistrationPage(WebDriver driverl) {
		
		driverr=driverl;
		PageFactory.initElements(driverl, this);
	}
	
	@FindBy(linkText="New User Register Here")
	WebElement newRegisteLink;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="re_password")
	WebElement co_password;
	
	@FindBy(id="full_name")
	WebElement fullname;
	
	@FindBy(id="email_add")
	WebElement emailadd;
	
	@FindBy(id="tnc_box")
	WebElement checkbox;
	
	@FindBy(id="Submit")
	WebElement registerbtn;
	
	//create associated methods
	public void clikRegisterLink() {
		newRegisteLink.click();
	}
	
	
	public void setUserUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void setUserPassword(String Password) {
		password.sendKeys(Password);
	}
	public void setConformPassword(String conpass) {
		co_password.sendKeys(conpass);
	}
	
	public void setFullname(String fname) {
		fullname.sendKeys(fname);
	}
	public void setEmailAddress(String emailid) {
		emailadd.sendKeys(emailid);
	}
	
	public void clickCheckbox() {
		checkbox.click();
	}
	
	public void clickRegisterbtn() {
		registerbtn.click();
	}

}
