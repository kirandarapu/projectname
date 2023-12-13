package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Utilities.XLUtils;
import junit.framework.Assert;

public class TC_DataDrivenTest_001 extends BaseClass {
	
	@Test(dataProvider="Exceldata")
	public void Datadriventest(String user,String pwd) throws IOException {
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUsername(user);
		
		lp.setPassword(pwd);
		
		lp.ClickLoginbtn();
		
		String exp_result="Adactin.com - Search Hotel11";
		String act_result=driver.getTitle();
		
		if(act_result.equals(exp_result)) {
			
			Assert.assertTrue(true);//hard asserts
			
			log.info("testcase is pass");
		}
		else {
			
			captureScreen(driver,"Datadriventest");
			Assert.assertTrue(false);
			
			log.info("testcase is failed");
		}
		
	}
	@DataProvider(name="Exceldata")
	String [][] getData() throws IOException{
		
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\Testdata\\Exceldata.xlsx";
		int rownum=XLUtils.getRowcount(path, "Sheet1");
		int colcount=XLUtils.getCellcount(path, "Sheet1", 1);
		
		String logindata[][]=new String [rownum][colcount];
		 
		for(int i=1;i<=rownum;i++) {//it is represent the rows
			
			for(int j=0;j<colcount;j++) {//it is represent the columns
				logindata[i-1][j]=XLUtils.getCelldata(path, "Sheet1", i, j);///1 0
			}
		}
		return logindata;
	}

}
