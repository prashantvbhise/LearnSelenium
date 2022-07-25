package commonPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSelenium {
	
	@BeforeMethod
	protected void beforeEveryTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriverFactory.setDriver(new ChromeDriver());
		WebDriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		WebDriverFactory.getDriver().manage().window().maximize();
	}
	
	//@AfterMethod
	protected void afterEveryTest() {
		WebDriverFactory.getDriver().quit();
	}

}
