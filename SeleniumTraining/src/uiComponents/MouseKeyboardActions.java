package uiComponents;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		/**
		 * Create an object of Actions class
		 */
		
		Actions act = new Actions(driver);
		//Creating a WebElement for the Others 'Menu' on hovering
		WebElement others=driver.findElement(By.id("others"));

		//Hover over an element
		act.moveToElement(others).build().perform();
		
		
		WebElement messageInput = driver.findElement(By.id("single-input-field"));
		//click or sendkeys inside textbox
		act.moveToElement(messageInput).click().sendKeys("Good Day").build().perform();
		
		//double click on an element
		WebElement showMessage=driver.findElement(By.id("button-one"));
		Thread.sleep(2000);
		act.moveToElement(showMessage).doubleClick().build().perform();
		
		//Right click, contextClick()-> This is for Right Click
		act.moveToElement(showMessage).contextClick().build().perform();
		
		/*
		 * WebElement valueA=driver.findElement(By.id("value-a"));
		 * act.moveToElement(valueA).click().keyDown(Keys.SHIFT).sendKeys("vineetha").
		 * build().perform();
		 */
		
		WebElement valueB=driver.findElement(By.id("value-b"));
		act.moveToElement(valueB).click().keyDown(Keys.SHIFT).sendKeys("all comes in capital letters").build().perform();
	}

}
