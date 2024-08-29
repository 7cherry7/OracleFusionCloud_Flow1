package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmPickSlipsPage extends BasePage {

	public ConfirmPickSlipsPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	//Tasks logo
	@FindBy(xpath = "//img[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsdiScmInvOverviewPage_itemNode_InvTasksList::icon']") WebElement task_logo;
	//Select confirm pick slip
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:_FOTRaT:0:r1:0:RAtl65']") WebElement pick_slip;
	//Organisation drop down
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:2:pt1:ap1:AT1:_ATp:organizationCodeId::lovIconId']") WebElement org_dp;
	//Search
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:2:pt1:ap1:AT1:_ATp:organizationCodeId::dropdownPopup::popupsearch']") WebElement search_btn;
	//Organisation input field
	@FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:2:pt1:ap1:AT1:_ATp:organizationCodeId::_afrLovInternalQueryId:value00::content']") WebElement txt_org;
    //Search button
	@FindBy(xpath = "//button[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:2:pt1:ap1:AT1:_ATp:organizationCodeId::_afrLovInternalQueryId::search']") WebElement search_btn1;
	//Selecting atl
	@FindBy(xpath = "//td[@align='left']//span[@class='x2hi'][normalize-space()='ATL_STORE1']") WebElement atl_store;
	//Ok button
	@FindBy(xpath = "//button[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:2:pt1:ap1:AT1:_ATp:organizationCodeId::lovDialogId::ok']") WebElement ok_btn;
	//Arrow
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:2:pt1:ap1:AT1:_ATp:cil1']") WebElement go_arrow;
	//Advance search
	@FindBy(xpath = "//td[@class='xhs']//a") WebElement adv_search;
	//Order drop down
	@FindBy(xpath = "//span[@id='pt1:_FOr1:1:_FONSr2:0:MAnt2:2:pt1:ap1:q1:value30::cntnr']//input\r\n") WebElement order_dp;
	//Search button
	@FindBy(.xpath = "//button[contains(text(),'Search')]\r\n") WebElement search_btn2;
	//Click on pick slip number
	@FindBy(xpath = "//span[@class='x2hi']/a") WebElement pickslip_no;
	//Check boxes
	@FindBy(xpath = "//label[@class='x17j' and @id='pt1:_FOr1:1:_FONSr2:0:MAnt2:3:pt1:apppanel:AT1:_ATp:table1:sbc2::Label0']") WebElement check_box;
	//Show more
	@FindBy(xpath = "//a[text()='Show More']") WebElement show_more;
	//Getting shippment id
	@FindBy(xpath = "(//td[@class='x18w xk7'])[4]") WebElement ship_id;
	//Confirm drop down
	@FindBy(xpath = "//a[@class='x1ka']") WebElement confirm_dp;
	
	@FindBy(xpath = "//td[normalize-space()='Confirm and Close']") WebElement confirm_close;
	//Done button
	@FindBy(xpath = "//div[@class='xeq p_AFTextOnly']//a[@class='xrg' ]") WebElement done_btn;
	
    public void tasksLogo() {
		task_logo.click();
	}
	public void pickSlipOption() {
		pick_slip.click();
	}
	public void organisation() {
		org_dp.click();
	}
	public void search() {
		search_btn.click();
	}
	public void organisation(String input) {
		txt_org.sendKeys(input);
	}
	public void search1() {
		search_btn.click();
	}
	public void selectingAtl1() {
		atl_store.click();
	}
	public void okButton() {
		ok_btn.click();
	}
	public void goArrow() {
		go_arrow.click();
	}
	public void advanceSearch() {
		adv_search.click();
	}
	public void orderDropdown(int orderId) {
		order_dp.sendKeys(orderId);
	}
    public void searchButton() {
    	search_btn2.click();
    }
    public void pickSlipNumber() {
    	pickslip_no.click();
    }
    public void checkBox() {
    	check_box.click();
    }
    public void showMore() {
    	show_more.click();
    }
    public void shippmentId() {
    	ship_id.getText();
    	System.out.println("Shipment id : " + ship_id);
    }
    public void confirmDropdown() {
    	confirm_dp.click();
    }
    public void confirmAndClose() {
    	confirm_close.click();
    }
    public void doneButton() {
    	done_btn.click();
    }
}
