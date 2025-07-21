package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\AdvanceSeleWorkspace/Demo1.html");
		
		String v=driver.findElement(By.id("username")).getAttribute("value");
		System.out.println(v);
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		String result = (String)j.executeScript("return document.getElementById('username').value");
		System.out.println(result);
		
		driver.quit();
		
	}

}
