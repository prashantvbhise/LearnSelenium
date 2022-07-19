package orangeHrm;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	static boolean driver= false;

	public static void main(String[] args) {

		if(driver==true) {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			
			ChromeDriver driver= new ChromeDriver();

		}else
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			
			FirefoxDriver driver = new FirefoxDriver();
		}


	}

}
