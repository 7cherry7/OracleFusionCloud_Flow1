package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super (driver);
	}
	 @FindBy(xpath = "//input[@id='userid']") WebElement txt_user;
	 @FindBy(xpath = "//input[@id='password']") WebElement txt_id;
	 @FindBy(xpath = "//button[@id='btnActive']") WebElement sign_btn;
	 
	public void userId(String id) {
			
			txt_user.sendKeys(id);
			
	}
		
	public void password(String pwd) {
			
			txt_id.sendKeys(pwd);
			
	}
		
	public void signIn() {
			
			sign_btn.click();
	}

}
