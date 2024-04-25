package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInvokation {

	public static void main(String[] args) throws InterruptedException {
		
		//creating an object of Chrome driver class
		WebDriver driver = new ChromeDriver();
		/*
		 ctrl+shift+o ->Importing packages
		 */
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		//to get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//for navigating back and forth
	    driver.navigate().back();
	    //waiting time
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		//close the browser
		driver.quit();
	}

}
