package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class LearnScrolling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500);", "");
		
		WebElement text = driver.findElement(By.xpath("//*[contains(text(),'Our students work at')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", text);
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver; js.executeScript();
		 */
	}

}
