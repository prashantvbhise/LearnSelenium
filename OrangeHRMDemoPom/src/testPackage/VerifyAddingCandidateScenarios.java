package testPackage;

import org.testng.annotations.Test;
import commonPackage.BaseSelenium;
import pageObjects.LoginPage;

public class VerifyAddingCandidateScenarios extends BaseSelenium{
	
	@Test
	public void verifyAddingQACandidate() throws InterruptedException {
		
		LoginPage lp= new LoginPage();		
		lp.successfulLogin("admin", "admin123")
			.clickRecruitmentLink()
				.clickonAddCandidateButton()
					.verifyAddingCandidate("Ankush", "Radhemohan", "Jome", 
							"abc@def.com", "09876543211", "Senior QA Lead", 
							"C:\\Users\\Pooja\\Desktop\\Downloads\\resumetest.docx",
							"Testing", "CandidateAddition");
	}
	@Test
	public void verifyAddingSoftwareEngineerCandidate() throws InterruptedException {
		
		LoginPage lp= new LoginPage();
		lp.successfulLogin("admin", "admin123")
			.clickRecruitmentLink()
				.clickonAddCandidateButton()
					.verifyAddingCandidate("Radhemohan", "Nareshbhai", "Jome", 
							"abc@def.com", "09876543211", "Software Engineer", 
							"C:\\Users\\Pooja\\Desktop\\Downloads\\resumetest.docx",
							"Testing", "CandidateAddition");
	}


}
