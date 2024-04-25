package uiComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender_Program2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/date-picker.php");
		
		driver.findElement(By.xpath("(//*[@class='fa fa-calendar'])[1]")).click();
		
		driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[1]")).click();
		
		
		Thread.sleep(1000);
		WebElement year =driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[2]"));
		//for selecting year
		
		while(!year.getText().contains("2020"))
		{
			driver.findElement(By.xpath("(//*[@class='prev'])[2]")).click();
		}
		
		
		Thread.sleep(1000);
		//for selecting month
		  List<WebElement> months =
		  driver.findElements(By.xpath("//*[@class='month']"));
		  
		  for(WebElement month : months ) 
		  { if(month.getText().equalsIgnoreCase("Jan"))
			{
			  month.click();
			  break; 
			 } 
		  }
		  Thread.sleep(1000);
		
		  //for selecting day
		  List<WebElement> days = driver.findElements(By.xpath("//*[@class='day']"));
		  
		  for(WebElement day : days ) 
		  { 
			  if(day.getText().equals("14")) 
			  { 
				  day.click();
				  break; 
			  } 
		  }
		 
	}

}
