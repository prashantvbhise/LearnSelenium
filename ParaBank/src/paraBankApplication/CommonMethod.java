package paraBankApplication;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonMethod {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void beforeEveryTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.manage().window().maximize();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}
	
	@AfterMethod
	public void afterEveryTest() {
		
		driver.quit();

	}

}
