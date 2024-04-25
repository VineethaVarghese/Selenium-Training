package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		/**
		 * Selenium Locators
		 * 
		 * 1. id
		 * 2. name
		 * 3. className
		 * 4. link text
		 * 5. partialLinkText
		 */

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		// WebElement hamburgerIcon = driver.findElement(By.id("react-burger-menu-btn"));
		 //hamburgerIcon.click();
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("About")).click();
		driver.navigate().back();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Logo")).click();

	}

}
