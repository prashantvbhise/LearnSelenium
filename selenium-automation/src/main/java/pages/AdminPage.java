package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.WebDriverFactory;

public class AdminPage {

	@FindBy(id = "btnAdd")
	private WebElement addUserButton;

	@FindBy(id="searchSystemUser_userName")
	private WebElement searchByUserName;
	
	@FindBy(id="searchBtn")
	private WebElement searchBtn;
	
	@FindBy(xpath="//td[text()='No Records Found']")
	private WebElement noRecordMsg;
	
	@FindBy(xpath="//a[contains(@href,'saveSystemUser?userId')]")
	private WebElement searchResult;
	
	@FindBy(id="customerList")
	private WebElement customerList;
	
	@FindBy(xpath="//input[contains(@id,'ohrmList_chkSelectRecord')]")
	private WebElement resultChkBx;

	public AdminPage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public AddUserPage clickonAddUserButton() {

		addUserButton.click();
		AddUserPage au = new AddUserPage();
		return au;
	}
	public AdminPage verifyAddedUserPresentOrNot(String strSearchByUserName, String strSearchResult) throws InterruptedException {
		Thread.sleep(2000);
		searchByUserName.sendKeys(strSearchByUserName);
		searchBtn.click();
		
		//if (customerList.isDisplayed()) {
			if (resultChkBx.isDisplayed()==false) {
				Assert.assertEquals(noRecordMsg.isDisplayed(), true);
				System.out.println(noRecordMsg.getText());		
		}else {
			Assert.assertEquals(searchResult.getText(), strSearchResult);
			System.out.println(searchResult.getText());
			
		}return this;
			
		
		

	}
}
