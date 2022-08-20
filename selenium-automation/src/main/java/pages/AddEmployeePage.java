package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.WebDriverFactory;

public class AddEmployeePage {

	@FindBy(xpath = "//a[contains(text(),'Add Employee')]")
	private WebElement addEmployeebtn;

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement middleName;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement photographPath;

	@FindBy(xpath = "//input[@type='checkbox' and @name='chkLogin']")
	private WebElement createLoginDetailsChkBox;

	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='user_password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='re_password']")
	private WebElement cnfPassword;

	@FindBy(name = "status")
	private WebElement activeStatusDrpdn;

	@FindBy(xpath = "//input[@type='button' and @value='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//input[@id='employeeId']")
	private WebElement txtEmployeeId;

	public AddEmployeePage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public PersonalDetailsPage verifyAddingEmployee(String strFirstName, String strMiddleName, String strLastName,
			String strPhotographPath, String strUserName, String strPassword, String strCnfPassword,
			String strUserStatus) throws InterruptedException {

		addEmployeebtn.click();
		firstName.sendKeys(strFirstName);
		middleName.sendKeys(strMiddleName);
		lastName.sendKeys(strLastName);
		photographPath.sendKeys(strPhotographPath);
		createLoginDetailsChkBox.click();
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		cnfPassword.sendKeys(strCnfPassword);
		Select userStatus = new Select(activeStatusDrpdn);
		userStatus.selectByVisibleText(strUserStatus);
		saveButton.click();
		String employeeId = txtEmployeeId.getAttribute("value");
		Thread.sleep(2000);
		System.out.println("EmployeeID for employee added is - " + employeeId);

		PersonalDetailsPage pdl = new PersonalDetailsPage();
		return pdl;

	}
	public PersonalDetailsPage verifyAddingEmployeeWithoutLogin(String strFirstName, String strMiddleName, String strLastName,
			String strPhotographPath) throws InterruptedException {

		addEmployeebtn.click();
		firstName.sendKeys(strFirstName);
		middleName.sendKeys(strMiddleName);
		lastName.sendKeys(strLastName);
		photographPath.sendKeys(strPhotographPath);
		saveButton.click();
		String employeeId = txtEmployeeId.getAttribute("value");
		Thread.sleep(2000);
		System.out.println("EmployeeID for employee added is - " + employeeId);
		PersonalDetailsPage pdl = new PersonalDetailsPage();
		return pdl;

	}

}
