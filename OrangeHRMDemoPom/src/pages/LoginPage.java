package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.WebDriverFactory;

public class LoginPage {

	@FindBy(id = "txtUsername")
	private WebElement username;

	@FindBy(id = "txtPassword")
	private WebElement password;

	@FindBy(id = "btnLogin")
	private WebElement loginButton;

	@FindBy(id = "spanMessage")
	private WebElement errorMsg;
	
	@FindBy(xpath = "//a[text()='Forgot your password?']")
	private WebElement forgotPasswodLink;

	public LoginPage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public HomePage successfulLogin(String strUsername, String strPassword) {

		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		loginButton.click();
		HomePage hp = new HomePage();
		return hp;
	}

	public LoginPage unsuccessfulLogin() {
		username.clear();
		password.clear();
		loginButton.click();
		return this;
	}

	public LoginPage wrongPassword(String strUsername, String strPassword) {
		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		loginButton.click();
		return this;
	}

	public LoginPage emptyCredential() {
		username.sendKeys("");
		password.sendKeys("");
		loginButton.click();
		return this;
	}
	
	public ResetPasswordPage clickForgotPasswordLink() {
		
		forgotPasswodLink.click();
		ResetPasswordPage rpp= new ResetPasswordPage();
		return rpp;
	}

	public LoginPage verifyErrorMsg() {

		if (errorMsg.getText().contains("Username cannot be empty")) {
			Assert.assertEquals(errorMsg.getText(), "Username cannot be empty");
		} else {
			Assert.assertEquals(errorMsg.getText(), "Invalid credentials");
		}
		return this;

	}
}
