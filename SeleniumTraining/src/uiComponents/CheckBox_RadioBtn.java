package uiComponents;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_RadioBtn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		//getting checkbox for the single radio button
		driver.findElement(By.xpath("//*[@id='gridCheck']")).click();
		
		/**
		 * Use click to Handle CheckBox and radio buttons 
		 */
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//*[@class='check-box-list']"));
		/*
		 * //@class='', we have used class here since we are use list method and all the
		 * class names re same . We cannot use type here
		 */	
		for(WebElement checkbox : checkBoxes) {
			checkbox.click();
		}
		
		driver.quit();
	}
	

}
