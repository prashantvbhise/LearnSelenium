package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.WebDriverFactory;

public class AddCandidatePage {

	@FindBy(id = "addCandidate_firstName")
	private WebElement firstName;

	@FindBy(name = "addCandidate[middleName]")
	private WebElement middleName;

	@FindBy(id = "addCandidate_lastName")
	private WebElement lastName;

	@FindBy(id = "addCandidate_email")
	private WebElement emailId;

	@FindBy(name = "addCandidate[contactNo]")
	private WebElement contactNo;

	@FindBy(xpath = "//select[@id='addCandidate_vacancy']")
	private WebElement jobVacancyDrpd;

	@FindBy(xpath = "//input[@name='addCandidate[resume]']")
	private WebElement candidateResume;

	@FindBy(xpath = "//input[@id='addCandidate_keyWords']")
	private WebElement candidateKeyword;

	@FindBy(id = "addCandidate_appliedDate")
	private WebElement candidateAppliedDate;

	@FindBy(id = "addCandidate_comment")
	private WebElement addComment;

	@FindBy(xpath = "//input[@name='addCandidate[consentToKeepData]']")
	private WebElement consentCheckbox;

	@FindBy(xpath = "//input[@type='button' and @value='Save']")
	private WebElement saveButton;

	public AddCandidatePage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public CandidateListPage verifyAddingCandidate(String strFirstName, String strMiddleName, String strLastName,
			String strEmailId, String strContactNo, String strJobVaccancy, String strResumePath, String strKeyword,
			String strAddComment) throws InterruptedException {
		firstName.sendKeys(strFirstName);
		middleName.sendKeys(strMiddleName);
		lastName.sendKeys(strLastName);
		emailId.sendKeys(strEmailId);
		contactNo.sendKeys(strContactNo);
		Select jobVaccancy = new Select(jobVacancyDrpd);
		jobVaccancy.selectByVisibleText(strJobVaccancy);
		candidateResume.sendKeys(strResumePath);
		candidateKeyword.sendKeys(strKeyword);
		candidateAppliedDate.clear();
		candidateAppliedDate.sendKeys("2022-07-13");
		Thread.sleep(2000);
		addComment.click();
		addComment.sendKeys(strAddComment);
		consentCheckbox.click();
		saveButton.click();
		CandidateListPage cl = new CandidateListPage();
		return cl;

	}

}
