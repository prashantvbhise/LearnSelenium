package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

		List<WebElement> linkList=driver.findElements(By.xpath("//a[@class='firstLevelMenu']"));

		for (int i=0; i<linkList.size(); i++)
		{
			String name= linkList.get(i).getText();

			System.out.println(name);

			/*if (name.contains("Recruitment")); {

				driver.findElements(By.xpath("//a[@class='firstLevelMenu']")).get(i).click();*/

			}

			}


		}

	
