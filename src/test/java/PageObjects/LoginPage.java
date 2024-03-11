package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	
	//locate the all webElements
	
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement btnLogin;
	
	public void setUsername(String user) {
		txtusername.sendKeys(user);
	}
	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	public void ClickLoginbtn() {
		btnLogin.click();
	}
	
	

}
