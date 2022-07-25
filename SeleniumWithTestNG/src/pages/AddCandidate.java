package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddCandidate {
	
	@FindBy(xpath="//a[contains(@href,'viewRecruitmentModule')]")
	WebElement viewRecruitmentModuleLink;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement addButton;
	
	@FindBy(id="addCandidate_firstName")
	WebElement firstName;
	
	@FindBy(name="addCandidate[middleName]")
	WebElement middleName;
	
	@FindBy(id="addCandidate_lastName")
	WebElement lastName;
	
	@FindBy(xpath="//input[@type='text' and @id='addCandidate_email']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@name='addCandidate[contactNo]']")
	WebElement contactNumber;
	
	@FindBy(xpath="//select[@id='addCandidate_vacancy']")
	WebElement jobVaccancy;
	
	@FindBy(xpath="//input[@name='addCandidate[resume]']")
	WebElement resumePath;
	
	@FindBy(id="addCandidate_keyWords")
	WebElement addKeywords;
	
	@FindBy(name="addCandidate[consentToKeepData]")
	WebElement consentCapture;
	
	@FindBy(xpath="//input[@type='button' and @value='Save']")
	WebElement saveButton;
	
	
	
	public void enterCandidateDetails(String strFirstName ,String strMiddleName, String strLastName, String strEmailId, String strContactNumber, String strJobVaccancyName, String strResumePath, String strAddKeywords) {
		
		viewRecruitmentModuleLink.click();
		addButton.click();
		firstName.sendKeys(strFirstName);
		middleName.sendKeys(strMiddleName);
		lastName.sendKeys(strLastName);
		emailId.sendKeys(strEmailId);
		contactNumber.sendKeys(strContactNumber);
		Select jobVacancydropdown= new Select(jobVaccancy);
		jobVacancydropdown.selectByVisibleText(strJobVaccancyName);
		resumePath.sendKeys(strResumePath);
		addKeywords.sendKeys(strAddKeywords);
		consentCapture.click();
		saveButton.click();
		
		
	}

}
