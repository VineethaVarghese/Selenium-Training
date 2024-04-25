package uiComponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
		
		/**
		 * 1. Switch to alert 
		 * 2. we can accept, dismiss, getText, sendkeys
		 */
		Alert alert = driver.switchTo().alert();
		//Alert is an interface,built in class
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn btn-warning']")).click();

		alertText = alert.getText();
		System.out.println(alertText);
		alert.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();

		alert.sendKeys("Niteesha");
		alert.accept();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
