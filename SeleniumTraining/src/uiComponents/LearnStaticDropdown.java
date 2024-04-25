package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnStaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/select-input.php");
		/**
		 * This technique is applicable only to select dropDown
		 * First select dropDown locator
		 * Secondly make object of select class and pass dropDown locator as argument
		 * Select using appropriate method
		 * 
		 */
		//WebElement cannot have a method in that.
		WebElement selectDropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		
		Select staticDropdown = new Select(selectDropdown);
		Thread.sleep(1000);
		staticDropdown.selectByValue("Yellow");
		Thread.sleep(1000);
		staticDropdown.selectByVisibleText("Green");
		Thread.sleep(1000);
		staticDropdown.selectByIndex(1);
		
		driver.quit();
		

	}
	
	

}