package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	/*find the element using selenium
	 * perform action using JS
	 * 
	 */
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///D:/AdvanceSeleWorkspace/Demo1.html");
			
			WebElement unTB = driver.findElement(By.id("username"));
			
			
			Thread.sleep(2000);
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("arguments[0].value=arguments[1]",unTB,"pree");
			
			Thread.sleep(2000);
			driver.quit();
			
		}

}
