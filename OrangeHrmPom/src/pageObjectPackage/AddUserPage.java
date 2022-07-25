package pageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import commonPackage.WebDriverFactory;

public class AddUserPage {
	@FindBy (id="systemUser_userType")
	private WebElement userTypeDropdown;
	@FindBy (xpath="//input[@id='systemUser_employeeName_empName']")
	private WebElement empName;
	@FindBy (xpath="//input[@name='systemUser[userName]']")
	private WebElement userName;
	@FindBy (name="systemUser[status]")
	private WebElement userStatus;	
	@FindBy (xpath="//input[@id='systemUser_password']")
	private WebElement password;	
	@FindBy (xpath="//input[@id='systemUser_confirmPassword']")
	private WebElement confirmPassword;	
	@FindBy (xpath="//input[@type='button' and @value='Save']")
	private WebElement saveButton;	
	public AddUserPage() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}	
	public void verifyAddUserTest(String strUserTypeDropdown, String strEmpName, String strUserName, 
			String strUserStatus, String strPassword, String strConfirmPassword ) {		
		Select userRole= new Select(userTypeDropdown);
		userRole.selectByVisibleText(strUserTypeDropdown);		
		empName.sendKeys(strEmpName);
		userName.sendKeys(strUserName);
		Select status= new Select(userStatus);
		status.selectByVisibleText(strUserStatus);		
		password.sendKeys(strPassword);		
		confirmPassword.sendKeys(strConfirmPassword);		
		saveButton.click();
		
	}
	
}
