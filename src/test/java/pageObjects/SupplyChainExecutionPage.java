package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SupplyChainExecutionPage extends BasePage {

	public SupplyChainExecutionPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	//Supply chain execution
	@FindBy(xpath = "//a[@id='groupNode_supply_chain_execution']") WebElement supply_chain_exe;
	//Inventory management
	@FindBy(xpath = "//a[@id='itemNode_warehouse_operations_InventoryManagement1_0']") WebElement im_logo;
	//Tasks logo
	@FindBy(xpath = "//img[@id='pt1:_FOr1:1:_FONSr2:0:_FOTsdiScmInvOverviewPage_itemNode_InvTasksList::icon']") WebElement task_logo;
	//Show tasks drop down
	@FindBy(xpath = "//select[@id='pt1:_FOr1:1:_FONSr2:0:_FOTRaT:0:soc1::content']") WebElement show_task_dp;
	//Create pick wave
	@FindBy(xpath = "//a[@id='pt1:_FOr1:1:_FONSr2:0:_FOTRaT:0:r1:0:RAtl64']") WebElement pick_wave;
	
	public void supplyChainExecution() {
		supply_chain_exe.click();
	}
	public void inventoryManagement() {
		im_logo.click();
	}
	public void tasksLogo() {
		task_logo.click();
	}
	public void showTasks() {
		show_task_dp.click();
		Select select = new Select(show_task_dp);
		select.selectByVisibleText("Shipments");
	}
	public void createPickWave() {
		pick_wave.click();
	}
	

}
