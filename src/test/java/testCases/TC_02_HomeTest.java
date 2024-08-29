package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_02_HomeTest extends BaseClass{
	
	@Test
	public void testHomePage() {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.userId(p.getProperty("userID"));
		lp.password(p.getProperty("password"));
		lp.signIn();
		
		HomePage hp = new HomePage(driver);
		
		hp.homeButton();
		hp.rightArrow();
		hp.orderManagementLogo();
		hp.orderManagementLogo1();
		
	}

}
