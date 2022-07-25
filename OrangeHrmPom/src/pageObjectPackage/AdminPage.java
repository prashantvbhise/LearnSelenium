package pageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.WebDriverFactory;

public class AdminPage {
	
	@FindBy (xpath="//input[@name='btnAdd']")
	private WebElement addButton;
	
	public AdminPage() {
		
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public void clickAddUser() {
		
		addButton.click();
	}
	
	
	
	
	
	
	
}
