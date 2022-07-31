package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.WebDriverFactory;

public class ResetPasswordPage {
	
	@FindBy(id = "securityAuthentication_userName")
	private WebElement resetForUserName;
	
	@FindBy(id = "btnSearchValues")
	private WebElement 	resetPasswordbtn;
	
	@FindBy(id = "btnCancel")
	private WebElement cancelBtn;
	
	
	public ResetPasswordPage() {
		
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public ResetPasswordPage verifyResetPassword(String strResetForUserName) {
		
		resetForUserName.sendKeys(strResetForUserName);
		
		resetPasswordbtn.click();
		
		return this;
	}
	
	public LoginPage verifyCancellingReset() {
		
		cancelBtn.click();
		
		LoginPage lp= new LoginPage();
		
		return lp;
	}

}
