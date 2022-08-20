package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.IInvokedMethodListenerImpl;
import pages.LoginPage;

@Listeners(IInvokedMethodListenerImpl.class)
public class AddCandidateTest {
	
	@Test (groups = {"Sanity", "Regression"})
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
	@Test (groups = {"Sanity"})
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
