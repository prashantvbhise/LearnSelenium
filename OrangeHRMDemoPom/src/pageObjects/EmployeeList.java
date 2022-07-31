package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.WebDriverFactory;

public class EmployeeList {

	@FindBy(id = "btnAdd")
	private WebElement addEmployeeButton;

	public EmployeeList() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public AddEmployee clickonAddEmployeeButton() {

		addEmployeeButton.click();
		AddEmployee ae = new AddEmployee();
		return ae;
	}
}
