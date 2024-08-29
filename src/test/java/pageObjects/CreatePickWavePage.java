package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreatePickWavePage extends BasePage {

	public CreatePickWavePage(WebDriver driver) {
		
		super(driver);
		
	}
	
	//Release rule drop down
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:PickingRuleName::lovIconId']") WebElement rr_dp;
	//Search
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:PickingRuleName::dropdownPopup::popupsearch']") WebElement sea_rch;
	//Release rule input field
	@FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:PickingRuleName::_afrLovInternalQueryId:value00::content']") WebElement txt_rr;
	//Search button
	@FindBy(xpath = "//button[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:PickingRuleName::_afrLovInternalQueryId::search']") WebElement sea_rch1;
	//Select CCDST_CS_Release_Rule
	@FindBy(xpath = "//span[normalize-space()='CCDST_CS_Release_Rule']") WebElement ccdst_cs;
	//Ok 
	@FindBy(xpath = "//button[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:PickingRuleName::lovDialogId::ok']") WebElement ok_btn;
	//Ship from organistion drop down
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:OrganizationCodeSL::lovIconId']") WebElement ship_org;
	//Selecting atl_store1
	@FindBy(xpath = "//span[@class='x2hi'][normalize-space()='ATL_STORE1']") WebElement ship_org_opt;
	//Order type drop down
	@FindBy(xpath = "//select[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:OrderTypeSL::content']") WebElement order_type_dp;
	//Shipping method drop down
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:ShipMethodSL::lovIconId']") WebElement ship_method;
	//Shipping method option
	@FindBy(xpath = "//span[normalize-space()='By Air-Air-Air']") WebElement ship_method_opt;
	//Order drop down
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:SalesOrderNumberSL::lovIconId']") WebElement order_dp;
	//Search
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:SalesOrderNumberSL::dropdownPopup::popupsearch']") WebElement sea_rch2;
	//Order input field
	@FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:SalesOrderNumberSL::_afrLovInternalQueryId:value00::content']") WebElement order_field;
	//Search button
	@FindBy(xpath = "//button[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:SalesOrderNumberSL::_afrLovInternalQueryId::search']") WebElement search_btn;
	//Selecting order & customer
	@FindBy(xpath = "//span[normalize-space()='Computer Sciences Corporation(ARIFJAN)']") WebElement order_customer;
	//Ok button
	@FindBy(xpath = "//button[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:SalesOrderNumberSL::lovDialogId::ok']") WebElement ok_btn1;
	//Release now button
	@FindBy(xpath = "//button[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:1:pt2:ap1:cb2']") WebElement release_now_btn;
	//Confirmation dialogue box
	@FindBy(xpath = "//td[@class='x1pn']//button//span[@class='xvc']") WebElement confirm_ok_btn;
	
	public void releaseRuleDropdown() {
		rr_dp.click();
	}
	public void search() {
		sea_rch.click();
	}
	public void releaseRuleInputField(String rri) {
		txt_rr.sendKeys(rri);
	}
	public void searchButton() {
		sea_rch1.click();
	}
	public void selectCcdst() {
		ccdst_cs.click();
	}
	public void okButton() {
		ok_btn.click();
	}
	public void shipFromOrg() {
		ship_org.click();
	}
	public void shipFromOrgOption() {
		ship_org_opt.click();
	}
	public void orderType() {
		order_type_dp.click();
		Select select = new Select(order_type_dp);
		select.selectByVisibleText("Sales order");
	}
	public void shippingMethod() {
		ship_method.click();
	}
	public void shippingMethodOption() {
		ship_method_opt.click();
	}
	public void order() {
		order_dp.click();
	}
	public void search2() {
		sea_rch2.click();
	}
    public void orderInputField(int order_id) {
    	order_field.sendKeys(order_id);
    }
    public void searchButton1() {
    	search_btn.click();
    }
    public void orderCustomer() {
    	order_customer.click();
    }
    public void okButton1() {
    	ok_btn1.click();
    }
    public void releaseNowButton() {
    	release_now_btn.click();
    }
    public void confirmOk() {
    	confirm_ok_btn.click();
    }
}
