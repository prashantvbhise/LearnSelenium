package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.WebDriverFactory;

public class HomePage {

	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	private WebElement welcomeMsg;

	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement adminLink;

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimLink;

	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement recruitmentLink;

	public HomePage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public HomePage verifyWelcomeMsg(String welcomeText) {
		Assert.assertEquals(welcomeMsg.getText(), welcomeText);
		return this;
	}

	public AdminPage clickAdminLinks() {
		
		Actions act= new Actions(WebDriverFactory.getDriver());
		act.moveToElement(adminLink).click().build().perform();
		//act.moveToElement(adminLink).contextClick().build().perform();
		//act.moveToElement(adminLink).clickAndHold().build().perform();
				
		//adminLink.click();
		AdminPage ap = new AdminPage();
		return ap;
	}

	public EmployeeListPage clickPimLinks() throws InterruptedException {
		Thread.sleep(1000);
		pimLink.click();
		EmployeeListPage el = new EmployeeListPage();
		return el;
	}

	public CandidateListPage clickRecruitmentLink() {
		recruitmentLink.click();
		CandidateListPage cl = new CandidateListPage();
		return cl;
	}
}
