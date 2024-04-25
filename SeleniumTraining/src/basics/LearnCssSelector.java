package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		/**
		 * CSS Selectors
		 *1.)  if you have a class = .className
		 *2. if we have id = #id
		 *3. for any attribute = tagname[attribute='value'] or [attribute='value']
		 *4. if multiple classes are there ,omit space and use . = className1.className2
		 *5.  Parent child = parent child
		 *6. index for multiple childs = :nth-child(index)  eg = .list li:nth-child(5)
		 *
		 */
		
		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector("#Email")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.cssSelector("[name='Password']")).sendKeys("mypassword");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		driver.findElement(By.cssSelector(".list li:nth-child(5)")).click();
        
        driver.quit();
        
	}

}
