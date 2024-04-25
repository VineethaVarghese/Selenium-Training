package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		/**
		 * 
		 * Syntax of Xpath :
		 * 1) //tagname[@atrribute='value'] or //*[@atrribute='value']
		 * 2) //tagname
		 * 3)  //tagname[@atrribute='value']/tagname //parentchild with just tagname of child
		 * 4)  //parent/child[index]
		 * 5) //*[contains(text(),'textValue')]  use with text 
		 * 6)//*[contains(@attribute,'subsetValue')]  eg. //*[contains(@id,'_EnteredQuantity')]
		 * 
		 * 
		 */
		driver.findElement(By.xpath("//a[@class='ico-login'] ")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("mypassword");
		driver.findElement(By.xpath("//*[@class='buttons']/input[@type='submit']")).click();
		driver.findElement(By.xpath("//ul[@class='list']/li[4]/a")).click();
		
		driver.findElement(By.xpath("//*[@class='product-title']//*[contains(text(),'Blue Jeans')]")).click();
		
		WebElement qtyBox = driver.findElement(By.xpath("//*[contains(@id,'_EnteredQuantity')]"));
		qtyBox.clear();
		qtyBox.sendKeys("27");
		
		driver.quit();
	}

}
