package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commonPackage.WebDriverFactory;

public class TransactionDetails {
	
	@FindBy(xpath="//h1[text()='Transaction Results']")
	private WebElement trxResultsHeading;
	
	public TransactionDetails() {
		
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public void verifyResultPage() {
		
	Assert.assertEquals(trxResultsHeading.getText(), "Transaction Results");
	}

}
