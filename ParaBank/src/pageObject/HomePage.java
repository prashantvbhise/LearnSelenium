package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commonPackage.WebDriverFactory;

public class HomePage {
	
	@FindBy(xpath="//h1[text()='Accounts Overview']")
	private WebElement successfulLogon;
	
	@FindBy(xpath="//a[text()='Find Transactions']")
	private WebElement findTransactionsLink;
	
	@FindBy(xpath="//a[text()='Transfer Funds']")
	private WebElement transferLink;
	
	
	public HomePage() {
		
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public void verifyLoginSuccess(String strSuccessfulLogon) {
	
	Assert.assertEquals(successfulLogon.getText(), strSuccessfulLogon);
	
	}
	
	public void clickOnFindTransction() {
		
		findTransactionsLink.click();
	}
	
	public void clickOnTransferLink() throws InterruptedException {
		
		transferLink.click();
		Thread.sleep(2000);
	}

}
