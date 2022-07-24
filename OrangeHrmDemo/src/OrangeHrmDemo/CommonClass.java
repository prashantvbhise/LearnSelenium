package OrangeHrmDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonClass {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void entryMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void exitMethod() {
		
		driver.quit();
		
	}

}
