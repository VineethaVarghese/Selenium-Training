package uiComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTables {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		
		List<WebElement> rowDatas = driver.findElements(By.xpath("//*[@id='dtBasicExample']/tbody/tr[6]/td"));
		
		for(WebElement datas : rowDatas)
		{
			System.out.println(datas.getText());
		}
	
	}

}
