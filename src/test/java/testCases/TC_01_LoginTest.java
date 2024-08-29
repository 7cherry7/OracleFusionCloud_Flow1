package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_01_LoginTest extends BaseClass {
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class) //Getting data provider from different class
	public void testLogin(String userID, String password) {
		
    LoginPage lp = new LoginPage(driver);
		
		lp.userId(userID);
		lp.password(password);
		lp.signIn();
	}
}
