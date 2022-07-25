package pageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commonPackage.WebDriverFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[@id='spanMessage']")
	private WebElement loginErrorMessage;
	
	public LoginPage() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public void login(String strUserName, String strPassword) {
		
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginButton.click();
	}	
	public void verifyErrorMessage(String expectedErrorMessage) {
		
		Assert.assertEquals(loginErrorMessage.getText(), expectedErrorMessage);
	}
}
