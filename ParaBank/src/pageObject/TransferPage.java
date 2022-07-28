package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import commonPackage.WebDriverFactory;

public class TransferPage {

	@FindBy(id="amount")
	private WebElement amountField;

	@FindBy(xpath="//input[@value='Transfer']")
	private WebElement transferbtn;

	@FindBy(xpath="//h1[text()='Transfer Complete!']")
	private WebElement successMessageCondition;

	@FindBy(id="fromAccountId")
	private WebElement fromAccountIdDropdown;

	@FindBy(id="toAccountId")
	private WebElement toAccountIdDropdown;

	@FindBy(id="amount.errors")
	private WebElement errorMessage;
	
	public TransferPage() {
		
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	public void enteringAmount(String strAmount) {
		
		amountField.sendKeys(strAmount);			
	}
	public void clickingTransferButton() throws InterruptedException {
		
		Thread.sleep(2000);
		
		transferbtn.click();
		
		
		
	}
	public void selectAccountsForTransfer() throws InterruptedException {
		
		
		Select fromDropdown= new Select(fromAccountIdDropdown);
		fromDropdown.selectByIndex(0);
		
		Select toDropdown= new Select(toAccountIdDropdown);
		toDropdown.selectByIndex(1);	
	}
	public void verifySuccess() throws InterruptedException {
		
		Thread.sleep(2000);
		
		Assert.assertEquals(successMessageCondition.isDisplayed(), true);
	}	
	public void verifyError() throws InterruptedException {
		
		Thread.sleep(2000);
		
		Assert.assertEquals(errorMessage.isDisplayed(), true);
	}
}


