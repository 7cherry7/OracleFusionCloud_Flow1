package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageShipmentsPage extends BasePage {

	public ManageShipmentsPage(WebDriver driver) {
		
		super(driver);
	
	}
	
	@FindBy(xpath = "//img[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsdiScmInvOverviewPage_itemNode_InvTasksList::icon']") WebElement task_logo;
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:_FOTRaT:0:r1:0:RAtl61']") WebElement manage_shipping_link;
	@FindBy(xpath = "//span[@class='x1u']//input[@class='x25']") WebElement txt_shipment;
	@FindBy(xpath = "//button[@class='xhv p_AFTextOnly' and @id='pt1:_FOr1:1:_FONSr2:0:MAnt2:4:pt1:ap1:q1::search']") WebElement search_btn;
	@FindBy(xpath = "//a[@class='x1o2' and @id='pt1:_FOr1:1:_FONSr2:0:MAnt2:5:pt1:scap1:inputComboboxListOfValues1::lovIconId']") WebElement ship_method_dp;
	@FindBy(xpath = "//tr[@class='xem']//span[@class='x2hi'][normalize-space()='By Air-Air-Air']") WebElement by_air;
	@FindBy(xpath = "//a[@class='xrg']//span[text()='Ship Confirm']") WebElement ship_confirm_btn;
	@FindBy(xpath = "//span[text()='Y']") WebElement yes_btn;
	@FindBy(xpath = "//a[@title='Save']") WebElement save_dp;
	@FindBy(xpath = "//span[(text()='S')]") WebElement save_close;
	@FindBy(xpath = "//img[@class='xjd' and @title='Settings and Actions']") WebElement f1_logo;
	@FindBy(xpath = "//a[@class=\"xny xmv\"]") WebElement sign_out;
	@FindBy(xpath = "//button[@id='Confirm']") WebElement confirm_btn;
	
	public void tasksLogo() {
		task_logo.click();
	}
    public void manageShipping() {
    	manage_shipping_link.click();
    }
    public void shippmentField(String ship) {
    	txt_shipment.sendKeys(ship);
    }
    public void searchButton() {
    	search_btn.click();
    }
    public void shippingMethodDropdown() {
    	ship_method_dp.click();
    }
    public void byAirOption() {
    	by_air.click();
    }
    public void shipConfirmButton() {
    	ship_confirm_btn.click();
    }
    public void yesButton() {
    	yes_btn.click();
    }
    public void saveDropdown() {
    	save_dp.click();
    }
    public void saveAndClose() {
    	save_close.click();
    }
    public void f1Logo() {
    	f1_logo.click();
    }
    public void signOut() {
    	sign_out.click();
    }
    public void confirmButton() {
    	confirm_btn.click();
    	System.out.println("Logout Successful");
    }
}
