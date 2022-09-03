package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.WebDriverFactory;

public class HomePage {
	
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	private WebElement welcomeMsg;

	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement adminLink;

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimLink;

	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement recruitmentLink;

	public HomePage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public HomePage verifyWelcomeText(String strActualText) {
		
		Assert.assertEquals(welcomeMsg.getText(), strActualText);
		return this;
		
	}

}
