package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage {
	
	public static WebDriver driver;
	public static Select sc;
	public SearchHotelPage(WebDriver ldriver) {
		
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(id="location")
	WebElement Location;
	
	@FindBy(id="hotels")
	WebElement Hotels;
	
	@FindBy(id="room_type")
	WebElement RoomType;
	
	@FindBy(id="room_nos")
	WebElement RoomNos;
	
	@FindBy(id="datepick_in")
	WebElement InDate;
	
	@FindBy(id="datepick_out")
	WebElement OutDate;
	
	@FindBy(id="adult_room")
	WebElement AdultRooms;
	
	@FindBy(id="child_room")
	WebElement ChildsRoom;
	
	@FindBy(id="Submit")
	WebElement Submit;
	
	//create associated methods
	
	public void setLocation() {
		sc=new Select(Location);
		sc.selectByIndex(2);
	}
	
	public void setHotels() {
		sc=new Select(Hotels);
		sc.selectByIndex(3);
	}
	
	public void setRoomType() {
		sc=new Select(RoomType);
		sc.selectByIndex(2);
	}
	
	public void setRoomNos() {
		sc=new Select(RoomNos);
		sc.selectByIndex(1);
	}
	
	public void setInDate(String Idate) {
		InDate.sendKeys(Idate);
	}
	public void setOutDate(String ODate) {
		OutDate.sendKeys(ODate);
	}
    
	public void setAdultsRoom() {
		sc=new Select(AdultRooms);
		sc.selectByIndex(2);
	}
	
	public void setChildsRoom() {
		sc=new Select(ChildsRoom);
		sc.selectByIndex(2);
	}
	
	public void clickSearch() {
		Submit.click();
	}
}
