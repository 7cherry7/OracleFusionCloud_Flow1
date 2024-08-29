package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateOrderPage extends BasePage {
	
	
	public CreateOrderPage(WebDriver driver) {
		
		super (driver);
		
		}
	//Create order button
	@FindBy(xpath = "//a[@role='button']") WebElement create_order_btn;
	//Customer drop down
	@FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:partyNameId::content']") WebElement cus_field;
	@FindBy(xpath = "//select[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:soc3::content']") WebElement bus_drp;
	@FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:orderType1Id::content']") WebElement ot_field;
	//Order lines select item text box
	@FindBy(xpath = "//input[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:itemNumberId2:lovTxtId::content']") WebElement select_item;
	//Order lines add button
	@FindBy(xpath = "//span[text()='Add']") WebElement add_btn;
	//Order lines add button selling profit center drop down
	@FindBy(id="pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:pc1:t1:0:PCBUId::lovIconId") WebElement dp;
	//Shipment Details
	//Logo
	@FindBy(xpath = "//div[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:sdi2::ti']") WebElement truck_logo;
	//General
    //Shipping method drop down
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:r5:0:sdi2::disAcr']") WebElement ship_method_dp;
	//Selecting by air option
	@FindBy(xpath = "//span[normalize-space()='By Air Air Air']") WebElement by_air_opt;
	//Shipping
	@FindBy(id = "pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:r5:0:sdi2::disAcr") WebElement shipping_link;
	//Shipment Priority
	//DropDown
	@FindBy(xpath = "//select[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:r5:0:soc5::content']") WebElement sp_dp;
	//FOB drop down
	@FindBy(xpath = "//select[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:r5:0:soc3::content']") WebElement fob_dp;
	//Shipping instructions
	@FindBy(xpath = "//textarea[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:r5:0:it2::content']") WebElement ship_inst;
	//Packing instructions
	@FindBy(xpath = "//textarea[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:r5:0:it3::content']") WebElement pack_inst;
	//Supply
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:r5:0:sdi17::disAcr']") WebElement sup_ply;
	//Warehouse drop down
	@FindBy(xpath = "//span[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:r5:0:warehouseNameId::cntnrSpan']//span[@class='x1o3']") WebElement ware_house;
	//Selecting warehouse
	@FindBy(xpath = "//span[text()='Trading Store1 Active Warehouse'][1]") WebElement warehouse_opt;
	//Billing and Payment Details
	//logo
	@FindBy(xpath = "//div[@title='Billing and Payment Details']") WebElement lo_go_1;
	//Payment Terms drop down
	@FindBy(xpath = "//select[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:r8:0:paymentTermId::content']") WebElement pay_term_dp;
	//Save drop down
	@FindBy(xpath = "//td[@role='toolbar']//a[@role='button']") WebElement save_dp;
	//Submit button
	@FindBy(xpath = "//span[text()='Submit']") WebElement sub_mit;
	//Clicking on ok button on confirmation dialogue box
	@FindBy(xpath = "//button[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:1:AP1:cb14']") WebElement confirm_box_ok;
	//Actions drop down
	@FindBy(xpath = "//div[@aria-label='Actions']//table[@role='presentation']") WebElement action_dp; 
	//Switch to fulfillment view option in actions drop down
	@FindBy(xpath = "//td[normalize-space()='Switch to Fulfillment View']") WebElement stfv_opt;
	//Fulfillment lines 
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:3:OrderDAP:sdi2::disAcr']") WebElement ful_fil_line;
	//Orchestration process number
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:3:OrderDAP:DooFu1:0:DooAt1:0:General:0:cl6']") WebElement orch_num;
	//Done button
	@FindBy(xpath = "//a[@accesskey='o']") WebElement done_btn;
	//Again done button
	@FindBy(xpath = "//div[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsr1:3:OrderDAP:SPb']") WebElement done_btn1;
	//Again done button
	@FindBy(xpath = "//div[@id='//']") WebElement done_btn2;
	//Home logo
	@FindBy(xpath = "//a[@id='pt1:_UIShome']") WebElement home_logo;
	
	
	
	
	public void createOrderButton() {
		
		create_order_btn.click();
		
	}
	
	public void customer(String cust_field) {
		
		cus_field.sendKeys(cust_field);
		cus_field.sendKeys(Keys.ARROW_DOWN);
		cus_field.sendKeys(Keys.ENTER);
		
		}
	
	public void businessUnit() {
		
		Select select = new Select(bus_drp);
		select.selectByIndex(1);
		
	}
	
	public void orderType(String or_field) {
		
		ot_field.sendKeys(or_field);
		ot_field.sendKeys(Keys.ARROW_DOWN);
		ot_field.sendKeys(Keys.ENTER);
		
	}
	
	public void selectItem(String si) {
		
	    select_item.sendKeys(si);
	    select_item.sendKeys(Keys.ENTER);
		
	}
	
	public void addButton() {
		
		add_btn.click();
		
		}
	
	public void sellingProfitCenterDropDown(String atlho) {
		
		dp.sendKeys(atlho);
		dp.sendKeys(Keys.ARROW_DOWN);
		dp.sendKeys(Keys.ENTER);
	}
	
	public void trucklogo() {
		
		truck_logo.click();
		
	}
	
	public void shippingMethod() {
		
		ship_method_dp.click();
	}
	
	public void byAir() {
		by_air_opt.click();
	}
	
	public void shippingLink() {
		
		shipping_link.click();
		
	}
	
	public void shipmentPriority() {
		
		sp_dp.click();
		Select select = new Select(sp_dp);
		select.selectByVisibleText("High");
	}
	
	public void fob(){
		fob_dp.click();
		Select select = new Select(fob_dp);
		select.selectByVisibleText("Origin");
	}
	
	public void shippingInstructions(String s_i) {
		
		ship_inst.sendKeys(s_i);
		
	}
	
	public void packingInstructions(String p_i) {
		
		pack_inst.sendKeys(p_i);
		
	}
	
    public void supply() {
    	
    	sup_ply.click();
    	
    }
    
    public void wareHouse() {
    	
    	ware_house.click();
    	
    }
    
    public void warehouseOption() {
    	warehouse_opt.click();
    }
    
    public void billAndPayLogo() {
    	
    	lo_go_1.click();
    	
    }
    
    public void payTerm() {
    	
    	pay_term_dp.click();
    	Select select = new Select(pay_term_dp);
    	select.selectByVisibleText("IMMEDIATE");
    }
    
    public void saveDropdown() {
    	save_dp.click();
    }
    
    public void submit() {
    	
    	sub_mit.click();
    	
    }
    
    public void confirmDialogueBoxOk() {
    	confirm_box_ok.click();
    }
    
    public void action() {
    	
    	action_dp.click();
    	
    }
    
    public void switchToFulfillmentViewOption() {
    	
    	stfv_opt.click();
    	
    }
    
    public void fulFillemtnLines() {
    	ful_fil_line.click();
    }
    
    public void orchestrationNumber() {
    	orch_num.click();
    }
    
    public void doneButton() {
    	done_btn.click();
    }
    
    public void doneButton1() {
    	done_btn1.click();
    }
    
    public void doneButton2() {
    	done_btn2.click();
    }
    
    public void homeButton() {
    	home_logo.click();
    }

}
