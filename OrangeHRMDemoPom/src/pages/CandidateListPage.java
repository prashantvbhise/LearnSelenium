package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class CandidateListPage {

	@FindBy(id = "btnAdd")
	private WebElement addCandidateButton;

	public CandidateListPage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public AddCandidatePage clickonAddCandidateButton() {

		addCandidateButton.click();
		AddCandidatePage ac = new AddCandidatePage();
		return ac;
	}
}
