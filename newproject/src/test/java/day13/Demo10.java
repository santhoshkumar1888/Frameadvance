package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Demo10 {

	/*find the element using selenium
	 * perform action using JS
	 * 
	 */
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///D:/AdvanceSeleWorkspace/Demo2.html");
			WebElement unTB = driver.findElement(By.xpath("//input[@name='un']"));
			Thread.sleep(2000);
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("arguments[0].value='preesant'",unTB);
			Thread.sleep(2000);
			driver.quit();
		}
}
