package uiComponents;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/jquery-select.php");
		
		driver.findElement(By.xpath("//*[contains(@class,'-selection--multiple')]")).sendKeys("new");
		
		//From the list it selects the state with 'new' keyword
		List<WebElement> states = driver.findElements(By.xpath("//*[contains(@class,'-results__options')]/li"));
		
		for(WebElement selectedstate : states) {
			//it checks if the text we got is equals to newyork
			if(selectedstate.getText().equalsIgnoreCase("new york"))
			{

				selectedstate.click();
				break;
			}
		}
		
		//driver.quit();
	}

}
