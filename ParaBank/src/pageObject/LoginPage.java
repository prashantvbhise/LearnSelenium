package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commonPackage.WebDriverFactory;

public class LoginPage {
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginBtn;
	
	
	public LoginPage() {
		
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public void loginToParaBank(String strUsername, String strPassword) {
		
		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		loginBtn.click();
	}

	
}
