 package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/AdvanceSeleWorkspace/Demo1.html");
		
		WebElement unTb = driver.findElement(By.id("username"));
		String v = unTb.getAttribute("value");
		System.out.println(v);
		
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		String js="alert(document.getElementById('username').value)";
		j.executeScript(js);
		 
		Thread.sleep(1000);
		driver.quit();
		

	}

}
