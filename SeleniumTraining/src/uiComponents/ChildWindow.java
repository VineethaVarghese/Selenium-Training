package uiComponents;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		System.out.println("Parent window  Title :"+driver.getTitle());
		
		driver.findElement(By.xpath("//*[@class='example']/a")).click();
		
		Set<String> window_handles = driver.getWindowHandles();
		
		Iterator<String> it = window_handles.iterator();
		
		String parentWindow = it.next();
		String childWindow= it.next();
		driver.switchTo().window(childWindow);
		System.out.println("Child window Title :"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window  Title :"+driver.getTitle());
		//driver.close();
		

	}

}
