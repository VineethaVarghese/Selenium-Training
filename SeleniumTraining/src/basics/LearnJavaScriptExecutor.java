package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJavaScriptExecutor {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");

		//Create Reference for interface
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		
		//WebElement textBox = driver.findElement(By.cssSelector("#single-input-field"));
		
		WebElement textBox= driver.findElement(By.cssSelector("#single-input-field"));
		
		js.executeScript("arguments[0].value = 'JavaScript Executer Programm';", textBox);
		
		WebElement message= driver.findElement(By.cssSelector("#button-one"));
		
		js.executeScript("arguments[0].click();", message);
	}

}
