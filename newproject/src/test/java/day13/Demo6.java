package day13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	//cmd line args in JS
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/AdvanceSeleWorkspace/Demo1.html");
		Thread.sleep(2000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("alert(arguments[0]+arguments[1])","santhu","preethu");
		Thread.sleep(2000);
		driver.close();
	}

}
