package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo10 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\AdvanceSeleWorkspace/sample1.html");
		
		List<WebElement> allTD = driver.findElements(By.xpath("//th|//td"));
		System.out.println(allTD.size());//18
		for(WebElement td:allTD)
		{
			System.out.println(td.getText());
		}
		System.out.println("---------");
		WebElement table1 = driver.findElement(By.id("t1"));
		List<WebElement> allTDOfTable1 =table1.findElements(By.xpath(".//th|.//td"));
		System.out.println(allTDOfTable1.size());//9
		for(WebElement td:allTDOfTable1)
		{
			System.out.println(td.getText());
		}
		driver.quit();
	}

}

