package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		System.out.println(driver.findElement(By.xpath("//*[@class='example']/h3")).getText());
		/**
		 * switch to frame using name, id, index or WebElement
		 */
		//driver.switchTo().frame("mce_0_ifr");
		WebElement frame = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("Vineetha is a good girl");
		//come outside of frame
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//*[@class='example']/h3")).getText());
		

		driver.quit();
	}

}
