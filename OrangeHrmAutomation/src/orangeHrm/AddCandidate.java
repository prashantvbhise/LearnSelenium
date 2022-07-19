package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddCandidate {

	public static void main(String[] args) {
		/*
		 * 1. Login to orange hrm 
		 * 2. Go to recruitment  
		 * 3. Add Candidate
		 * 4. Code should be chrome and firefox compatible
		 */
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//Logon to OHRM
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

		//Adding Candidate
		driver.findElement(By.xpath("//a[contains(@href,'viewRecruitmentModule')]")).click();

		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();

		driver.findElement(By.xpath("//input[@id='addCandidate_firstName']")).sendKeys("Ankur");

		driver.findElement(By.xpath("//input[@name='addCandidate[middleName]']")).sendKeys("Pratap");

		driver.findElement(By.xpath("//input[@type='text' and @id='addCandidate_lastName']")).sendKeys("Singh");

		driver.findElement(By.xpath("//input[@type='text' and @id='addCandidate_email']")).sendKeys("ankur.singh@gmail.com");

		driver.findElement(By.xpath("//input[@name='addCandidate[contactNo]']")).sendKeys("09632587410");

		Select jobVacancy= new Select(driver.findElement(By.xpath("//select[@id='addCandidate_vacancy']")));

		jobVacancy.selectByVisibleText("Senior QA Lead");

		driver.findElement(By.xpath("//input[@name='addCandidate[resume]']")).sendKeys("C:\\Users\\Pooja\\Desktop\\Downloads\\resumetest.docx");

		driver.findElement(By.xpath("//input[@id='addCandidate_keyWords']")).sendKeys("Testing");

		driver.findElement(By.xpath("//input[@name='addCandidate[consentToKeepData]']")).click();

		driver.findElement(By.xpath("//input[@type='button' and @value='Save']")).click();

		System.out.println("Candidate Added");
		
		driver.findElement(By.id("btnBack")).click();
		
		driver.findElement(By.xpath("//input[@name='chkSelectRow[]']")).click();
		
		driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
		
		driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();

		//driver.quit();	

	}

}
