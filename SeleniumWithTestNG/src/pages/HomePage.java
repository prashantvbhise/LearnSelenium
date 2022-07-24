package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {
	
	@FindBy (xpath="//a[@id='welcome']")
	WebElement welcomeMessage;
	
	public void verifyWelcomeMessage(String strExpectedWelcomeMessage) {
		
		Assert.assertEquals(welcomeMessage.getText(), strExpectedWelcomeMessage);
	}
	

}
