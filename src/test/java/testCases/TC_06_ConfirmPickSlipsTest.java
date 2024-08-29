package testCases;

import org.testng.annotations.Test;

import pageObjects.ConfirmPickSlipsPage;
import pageObjects.CreateOrderPage;
import pageObjects.CreatePickWavePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SupplyChainExecutionPage;
import testBase.BaseClass;

public class TC_06_ConfirmPickSlipsTest extends BaseClass{
	
	@Test
	public void testConfirmPickSlipsPageTest() {

	LoginPage lp = new LoginPage(driver);
	
	lp.userId(p.getProperty("userID"));
	lp.password(p.getProperty("password"));
	lp.signIn();
	
	HomePage hp = new HomePage(driver);
	
	hp.homeButton();
	hp.rightArrow();
	hp.orderManagementLogo();
	hp.orderManagementLogo1();
	
	CreateOrderPage cop = new CreateOrderPage(driver);
	
	cop.createOrderButton();
	cop.businessUnit();
	cop.customer("computer sciences corporation");
	cop.orderType("cash sales stock");
	cop.selectItem("ASH2");
	cop.addButton();
	cop.sellingProfitCenterDropDown("ATL-HO");
	cop.trucklogo();
	cop.shippingMethod();
	cop.byAir();
	cop.shippingLink();
	cop.shipmentPriority();
	cop.fob();
	cop.shippingInstructions("Fragile");
	cop.packingInstructions("Careful");
	cop.supply();
	cop.wareHouse();
	cop.warehouseOption();
	cop.billAndPayLogo();
	cop.payTerm();
	cop.saveDropdown();
	cop.submit();
	cop.confirmDialogueBoxOk();
	cop.action();
	cop.switchToFulfillmentViewOption();
	cop.fulFillemtnLines();
	cop.orchestrationNumber();
	cop.doneButton();
	cop.doneButton1();
	cop.doneButton2();
	cop.homeButton();
	
	SupplyChainExecutionPage scep = new SupplyChainExecutionPage(driver);
	
	scep.supplyChainExecution();
	scep.inventoryManagement();
	scep.tasksLogo();
	scep.showTasks();
	scep.createPickWave();
	
	CreatePickWavePage cpw = new CreatePickWavePage(driver);
	
	cpw.releaseRuleDropdown();
	cpw.search();
	cpw.releaseRuleInputField(null);
	cpw.searchButton();
	cpw.selectCcdst();
	cpw.okButton1();
	cpw.shipFromOrg();
	cpw.shipFromOrgOption();
	cpw.orderType();
	cpw.shippingMethod();
	cpw.shippingMethodOption();
	cpw.order();
	cpw.search2();
	cpw.orderInputField(0);
	cpw.searchButton1();
	cpw.orderCustomer();
	cpw.okButton1();
	cpw.releaseNowButton();
	cpw.confirmOk();
	
	ConfirmPickSlipsPage cps = new ConfirmPickSlipsPage(driver);
	
	cps.tasksLogo();
	cps.pickSlipOption();
	cps.organisation();
	cps.search();
	cps.organisation(null);
	cps.search1();
	cps.selectingAtl1();
	cps.okButton();
	cps.goArrow();
	cps.advanceSearch();
	cps.orderDropdown(0);
	cps.searchButton();
	cps.pickSlipNumber();
	cps.checkBox();
	cps.showMore();
	cps.shippmentId();
	cps.confirmDropdown();
	cps.confirmAndClose();
	cps.doneButton();
	}

}
