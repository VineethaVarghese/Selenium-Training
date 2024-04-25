package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		WebElement element = driver.findElement(By.className("submit-button"));
		element.click();
		/*
		 * findElement -> returns us a single WebElement
		 * findElements -> returns us a list of WebElements
		 */
		
		List<WebElement> addToCart = driver.findElements(By.className("btn_inventory"));
		System.out.println(addToCart.size());
		
		/*
		 * for(int i=0; i<addToCart.size();i++) { addToCart.get(i).click(); }
		 */
		
		
		  for(WebElement addToCartBtn : addToCart) 
		  { 
			 addToCartBtn.click(); 
		  }
		 
	}

}
