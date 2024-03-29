package loginTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginScenarios extends CommonFunction {
	// @Test
	public void logonMethod() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//input[@name='login-button']")).click();

		Thread.sleep(1000);

		Select sortOptions = new Select(driver.findElement(By.xpath("//select[@data-test='product_sort_container']")));

		sortOptions.selectByValue("za");

		/*
		 * sortOptions.selectByVisibleText("Price (low to high)");
		 * 
		 * sortOptions.selectByIndex(3);
		 * 
		 * List<WebElement> inventoryList =
		 * driver.findElements(By.xpath("//div[@class='inventory_item']"));
		 * 
		 * System.out.println(inventoryList);
		 */

		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();

		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}

	@Test
	public void viewProductDetails() {

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//input[@name='login-button']")).click();

		List<WebElement> productList = driver.findElements(By.className("inventory_item_name"));

		System.out.println(productList.size());

		for (int i = 0; i < productList.size(); i++) {

			// String name =productList.get(i).getText();

			driver.findElements(By.className("inventory_item_name")).get(i).click();

			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

			String buttonLabel = driver.findElement(By.xpath("//button[text()='Remove']")).getText();

			Assert.assertEquals(buttonLabel, "REMOVE");

			driver.findElement(By.id("back-to-products")).click();

			// System.out.println(name);

			/*
			 * if(name.contains("Sauce Labs Bolt T-Shirt")) {
			 * 
			 * driver.findElements(By.className("inventory_item_name")).get(i).click();
			 * 
			 * driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			 * 
			 * String buttonLabel =
			 * driver.findElement(By.xpath("//button[text()='Remove']")).getText();
			 * 
			 * Assert.assertEquals(buttonLabel, "REMOVE");
			 * 
			 * driver.findElement(By.id("back-to-products")).click(); }
			 */
		}
		
		driver.findElement(By.id("shopping_cart_container")).click();
		
		List<WebElement> buttonList = driver.findElements(By.xpath("//button[text()='Remove']"));

		for (int i = 0; i < buttonList.size(); i++) {

			driver.findElements(By.xpath("//button[text()='Remove']")).get(i).click();

		}

		/*
		 * for (WebElement webElement : productList) { String name =
		 * webElement.getText(); System.out.println(name); }
		 */

	}

	//@Test
	public void removeFromCart() {

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//input[@name='login-button']")).click();

		List<WebElement> productList = driver.findElements(By.className("inventory_item_name"));

		System.out.println(productList.size());

		for (int i = 0; i < productList.size(); i++) {

			// String name =productList.get(i).getText();

			driver.findElements(By.className("inventory_item_name")).get(i).click();


			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

			driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();

		}

		List<WebElement> buttonList = driver.findElements(By.xpath("//button[text()='Remove']"));

		for (int i = 0; i < buttonList.size(); i++) {

			driver.findElements(By.xpath("//button[text()='Remove']")).get(i).click();

		}

	}

}
