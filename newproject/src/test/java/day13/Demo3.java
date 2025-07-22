package day13;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/AdvanceSeleWorkspace/Demo1.html");
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		//send js, execute it and get back the result
		//String js="alert(document.getElementById('username').value)";
		 String result = (String) j.executeScript("return document.getElementById('username').value");
		System.out.println(result);
		
		Thread.sleep(2000);
		driver.close();

	}

}
