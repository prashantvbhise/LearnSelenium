package orange_Hrm;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		ChromeDriver chrome = new ChromeDriver();
		
		chrome.get("https://gmail.com");
			

	}

}
