package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NopCommerceAdminLogin  {
	
	public static WebDriver driver;
	
	@Test
	public void openapplication() {
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.opencart.com/admin/");
		
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.id("input-username"));
		//ele1.clear();
		ele1.sendKeys("demo");
		WebElement ele2=driver.findElement(By.id("input-password"));
		//ele2.clear();
		ele2.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		//label[@class='ctp-checkbox-label']/input
	
	}
	
	
	
	

}
