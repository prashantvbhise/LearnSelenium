package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class AdminPage {

	@FindBy(id = "btnAdd")
	private WebElement addUserButton;

	public AdminPage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public AddUserPage clickonAddUserButton() {

		addUserButton.click();
		AddUserPage au = new AddUserPage();
		return au;
	}

}
