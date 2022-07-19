package loginTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonFunction {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void beforeEveryTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
	}
	
	//@AfterMethod
	public void afterEveryTest() {
		
		driver.quit();
	}

}
