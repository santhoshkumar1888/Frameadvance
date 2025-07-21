package day13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\AdvanceSeleWorkspace/Dem01.html");
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		String js="alert('hi')";
		j.executeScript(js);
		 
		Thread.sleep(1000);
		driver.quit();
		

	}

}
