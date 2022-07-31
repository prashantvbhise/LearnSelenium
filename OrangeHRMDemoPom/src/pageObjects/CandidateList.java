package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.WebDriverFactory;

public class CandidateList {

	@FindBy(id = "btnAdd")
	private WebElement addCandidateButton;

	public CandidateList() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public AddCandidate clickonAddCandidateButton() {

		addCandidateButton.click();
		AddCandidate ac = new AddCandidate();
		return ac;
	}
}
