package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApproveTime {

	public static void main(String[] args) {
		/*
		 * 1. Login to orange hrm 
		 * 2. Open first pending action
		 * 3. Put comment and approve time
		 * 4. Code should be chrome and firefox compatible
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'viewTimeModule')]")).click();
		
		driver.findElement(By.xpath("//a[@id='viewSubmitted']")).click();
		
		driver.findElement(By.xpath("//textarea[@id='txtComment']")).sendKeys("Approve");
		
		driver.findElement(By.xpath("//input[@id='btnApprove']")).click();
		
		System.out.println("First Timesheet approved");
		
		driver.quit();
		

	}

}
