package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class EmployeeListPage {

	@FindBy(id = "btnAdd")
	private WebElement addEmployeeButton;

	public EmployeeListPage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public AddEmployeePage clickonAddEmployeeButton() {

		addEmployeeButton.click();
		AddEmployeePage ae = new AddEmployeePage();
		return ae;
	}
}
