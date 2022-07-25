package pageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commonPackage.WebDriverFactory;

public class HomePage {
	@FindBy (xpath="//a[@id='welcome']")
	private WebElement welcomeMessage;
	
	@FindBy (xpath="//a[@id='menu_admin_viewAdminModule']")
	private WebElement LinkText;	
	
	public HomePage() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
		
	}
	
	public void verifyWelcomeMessage(String strExpectedWelcomeMessage) {
		
		Assert.assertEquals(welcomeMessage.getText(), strExpectedWelcomeMessage);
	}
	
	public void verifyClickingAdminLink() {
		
		LinkText.click();
				
	}
}
