package commonPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	@BeforeMethod
	public void beforeEveryTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriverFactory.setDriver(new ChromeDriver());
		
		WebDriverFactory.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
		
		WebDriverFactory.getDriver().manage().window().maximize();
	}
	
	@AfterMethod
	public void afterEveryTest() {
		
		WebDriverFactory.getDriver().quit();
	}

}
