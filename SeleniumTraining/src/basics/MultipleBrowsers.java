package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {

	public static void main(String[] args) {
		
		String browser ="Edge";
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
		 driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) 
		{
		  driver = new FirefoxDriver();
		}
		else 
		{
		  System.out.println("Not a valid browser");
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.quit();		}

}
