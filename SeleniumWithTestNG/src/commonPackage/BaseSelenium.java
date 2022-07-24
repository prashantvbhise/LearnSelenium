package commonPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSelenium {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void beforeEveryTest() throws InterruptedException {
		
		System.out.println("beforeEveryTest run started");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().window().fullscreen();
		
		//Thread.sleep(1000);
				
	}
	
	@AfterMethod
	public void afterEveryTest() {
		
		driver.quit();
		
		System.out.println("afterEveryTest executed");
	}
	
	

}
