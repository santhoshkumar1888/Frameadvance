package day13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	//cmd line args in JS
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/AdvanceSeleWorkspace/Demo1.html");
		Thread.sleep(2000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.getElementById(arguments[0]).value=arguments[1]","username","preethu");
		Thread.sleep(2000);
		driver.close();
	}

}
