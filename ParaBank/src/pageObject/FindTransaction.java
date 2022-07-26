package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import commonPackage.WebDriverFactory;

public class FindTransaction {
	
	@FindBy(id="accountId")
	private WebElement accountIddrdn;
	
	@FindBy(id="criteria.transactionId")
	private WebElement transactionId;
	
	@FindBy(xpath="//button[contains(@ng-click,'ID')]")
	private WebElement findByIdbtn;
	
	@FindBy(id="criteria.onDate")
	private WebElement searchDate;
	
	@FindBy(xpath="//button[contains(@ng-click,'DATE')]")
	private WebElement findByDatebtn;
	
	@FindBy(id="criteria.fromDate")
	private WebElement trxFromDate;
	
	@FindBy(id="criteria.toDate")
	private WebElement trxToDate;
	
	@FindBy(xpath="//button[contains(@ng-click,'DATE_RANGE')]")
	private WebElement findByDateRangebtn;
	
	@FindBy(id="criteria.amount")
	private WebElement searchAmount;
	
	@FindBy(xpath="//button[contains(@ng-click,'AMOUNT')]")
	private WebElement findByAmountbtn;
	
	public FindTransaction() {
		
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public void searchTransactionbyId(String strTransactionId) {
		
		Select accountSelection = new Select(accountIddrdn);
		accountSelection.selectByIndex(0);
		transactionId.sendKeys(strTransactionId);
		findByIdbtn.click();
	}
	
	public void searchTransactionbyDate(String strSearchDate) {
		
		Select accountSelection = new Select(accountIddrdn);
		accountSelection.selectByIndex(0);
		searchDate.sendKeys(strSearchDate);
		findByDatebtn.click();
	}
	public void searchTransactionbyDateRange(String strTrxFromDate, String strTrxToDate) {
		
		Select accountSelection = new Select(accountIddrdn);
		accountSelection.selectByIndex(0);
		trxFromDate.sendKeys(strTrxFromDate);
		trxToDate.sendKeys(strTrxToDate);
		findByDateRangebtn.click();
	}
	public void searchTransactionbyAmount(String strSearchAmount) {
		
		Select accountSelection = new Select(accountIddrdn);
		accountSelection.selectByIndex(0);
		searchAmount.sendKeys(strSearchAmount);
		findByAmountbtn.click();
	}

}
