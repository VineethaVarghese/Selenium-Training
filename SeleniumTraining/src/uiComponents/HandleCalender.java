package uiComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.List;

public class HandleCalender {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/date-picker.php");
		
		driver.findElement(By.xpath("(//*[@class='fa fa-calendar'])[1]")).click();
		
		WebElement month = driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[1]"));
		
		while(!month.getText().contains("December"))
		{
			driver.findElement(By.xpath("(//*[@class='next'])[1]")).click();
		}
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@class='day']"));
		
		for(WebElement day : days) {
			if(day.getText().equals("31")) {
				day.click();
				break;
			}
		}
	}

}

