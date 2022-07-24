package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement loginButton;
	
	@FindBy(xpath="//span[@id='spanMessage']")
	WebElement loginErrorMessage;
	
	public void login(String strUserName, String strPassword) {
		
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginButton.click();
	}
	
	public void verifyErrorMessage(String expectedErrorMessage) {
		
		Assert.assertEquals(loginErrorMessage.getText(), expectedErrorMessage);
	}

}
