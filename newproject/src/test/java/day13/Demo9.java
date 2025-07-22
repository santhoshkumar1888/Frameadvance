package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {
	/*find the element using selenium
	 * perform action using JS
	 * 
	 */
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///D:/AdvanceSeleWorkspace/Demo2.html");
			
			Thread.sleep(1000);
			driver.findElement(By.name("un")).sendKeys("santhpree");
			Thread.sleep(1000);
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("document.getElementsByName('un')[0].value='preethu'");
			Thread.sleep(1000);
			driver.quit();
			
		}

}
