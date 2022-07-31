package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commonPackage.WebDriverFactory;

public class HomePage {

	@FindBy(id = "welcome")
	private WebElement welcomeMsg;

	@FindBy(id = "menu_admin_viewAdminModule")
	private WebElement adminLink;

	@FindBy(id = "menu_pim_viewPimModule")
	private WebElement pimLink;

	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	private WebElement recruitmentLink;

	public HomePage() {

		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public HomePage verifyWelcomeMsg() {
		Assert.assertEquals(welcomeMsg.getText(), "Welcome Paul");
		return this;
	}

	public AdminPage clickAdminLinks() {
		adminLink.click();
		AdminPage ap = new AdminPage();
		return ap;
	}

	public EmployeeList clickPimLinks() throws InterruptedException {
		Thread.sleep(1000);
		pimLink.click();
		EmployeeList el = new EmployeeList();
		return el;
	}

	public CandidateList clickRecruitmentLink() {
		recruitmentLink.click();
		CandidateList cl = new CandidateList();
		return cl;
	}
}
