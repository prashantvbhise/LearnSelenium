package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.WebDriverFactory;

public class LoginPage {
	
	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement errorMsg;
	
	@FindBy(xpath = "//div[@class='orangehrm-login-forgot']")
	private WebElement forgotPasswodLink;

	public LoginPage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public HomePage loginToOrangeHRM(String strUserName, String strPassword) {
		
		username.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginButton.click();
		HomePage hp= new HomePage();
		return hp;
	}
	public LoginPage verifyErrorMessage(String strUserName, String strPassword) {
		
		username.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginButton.click();
		Assert.assertEquals(errorMsg.getText(), "Invalid credentials");
		return this;
	}
}
