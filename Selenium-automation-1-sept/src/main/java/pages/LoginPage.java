package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class LoginPage {
	
	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	public LoginPage() {
		
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public HomePage loginToOraneHrm(String strUsername, String strPassword) {
		
		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		loginButton.click();
		HomePage hp = new HomePage();
		return hp;
		
	}

}
