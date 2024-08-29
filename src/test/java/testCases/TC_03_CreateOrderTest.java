package testCases;

import org.testng.annotations.Test;

import pageObjects.CreateOrderPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_03_CreateOrderTest extends BaseClass{
	@Test
	public void testCreateOrder() {

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
	}
}
