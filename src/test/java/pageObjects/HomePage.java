package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		
		super(driver);

	}
	
	    @FindBy(xpath = "//a[@id='pt1:_UIShome']") WebElement home_logo;
	    @FindBy(xpath = "//div[@id='clusters-right-nav']") WebElement scroll_arrow;
	    @FindBy(xpath = "//a[@id='groupNode_order_management']") WebElement order_logo;
	    @FindBy(xpath = "//a[@id='itemNode_order_management_order_management_0']") WebElement order_logo1;
	    
		
		public void homeButton() {
			
			home_logo.click();
			
		}
		
		public void rightArrow() {
			
			scroll_arrow.click();
			scroll_arrow.click();
			
		}
		
		public void orderManagementLogo() {
			
			order_logo.click();
		}
		
		public void orderManagementLogo1() {
			
			order_logo1.click();
		}

}
