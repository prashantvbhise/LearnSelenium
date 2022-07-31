package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.WebDriverFactory;

public class AdminPage {

	@FindBy(id = "btnAdd")
	private WebElement addUserButton;

	public AdminPage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public AddUser clickonAddUserButton() {

		addUserButton.click();
		AddUser au = new AddUser();
		return au;
	}

}
