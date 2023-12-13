package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {//reading the properties file data (supporting file)

	Properties pro;
	
	public ReadConfig() {
		//configurate the properties file ./ project home directory
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(f);//convert file data into reading mode
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//associated methods
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUsername() {
		String user=pro.getProperty("username");
		return user;
	}
	
	public String getPassword() {
		String pass=pro.getProperty("password");
		return pass;
	}
	
	public String getUserUsername() {
		String Uuname=pro.getProperty("Username");
		return Uuname;
	}
	
	public String getUserPassword() {
		String Upassword=pro.getProperty("Password");
		return Upassword;
	}
	
	public String getConfirmPassword() {
		String co_pass=pro.getProperty("co_Pass");
		return co_pass;
	}
	public String getFullname() {
		String Fullname=pro.getProperty("Fullname");
		return Fullname;
	}
	
	public String getEmailId() {
		String EmailID=pro.getProperty("EmailAddress");
		return EmailID;
	}
	
	public String getInDate() {
		String InDate=pro.getProperty("Indate");
		return InDate;
	}
	
	public String getOutDate() {
		String OutDate=pro.getProperty("OutDate");
		return OutDate;
	}
}
