package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.SearchHotelPage;
import junit.framework.Assert;

public class TC_SearchHotel_003 extends BaseClass {
	
	@Test
	public void  searchhotelTest() throws IOException {
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUsername(username);
		log.info("username is enetered");
		
		lp.setPassword(password);
		log.info("password is enetered");
		
		lp.ClickLoginbtn();
		log.info("login button click activity completed");
		
		//enter into serch hotel functionality
		
		SearchHotelPage shp= new SearchHotelPage (driver);
	    shp.setLocation();
	    log.info("set the location");
	    shp.setHotels();
	    log.info("set the hotels");
	    shp.setRoomType();
	    log.info("set the Roomtype");
	    shp.setRoomNos();
	    log.info("set the roomnos");
	    shp.setInDate(InDate);
	    log.info("set the Indate");
	    shp.setOutDate(OutDate);
	    log.info("set the outdate");
	    shp.setAdultsRoom();
	    log.info("set the Adults per room");
	    shp.setChildsRoom();
	    log.info("set the childs per room");
	    
	    shp.clickSearch();
	    log.info("search button click activity is completed");
	    
	    
	   String  Exp_result= "Adactin.com - Select Hotel11";
	   String Act_result=driver.getTitle();
	   
	   if(Act_result.equals(Exp_result)) {
		   
		   Assert.assertTrue(true);
		   log.info("testcase execution success");
	   } else
	   {
		   captureScreen(driver,"searchhotelTest");
		   Assert.assertTrue(false);
		   log.info("testcase execution fail");
		   
		   
	   }
	}

}
