package common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSelenium {

	//@BeforeMethod (groups = {"Sanity", "Regression"})
	public void beforeEveryMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriverFactory.setDriver(new ChromeDriver());

		WebDriverFactory.getDriver().manage().window().maximize();

		WebDriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}

	//@AfterMethod (groups ={"Sanity", "Regression"})
	public void afterEveryMethod() {

		WebDriverFactory.getDriver().quit();
	}

}
