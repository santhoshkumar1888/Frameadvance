package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Demo11 {

	/*find the element using selenium
	 * perform action using JS even if the element is disabled
	 * 
	 */
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///D:/AdvanceSeleWorkspace/Demo3.html");
			WebElement unTB = driver.findElement(By.id("username"));
			try {
				unTB.sendKeys("santhosh");
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("arguments[0].value='preethusanthosh'",unTB);
			Thread.sleep(2000);
			driver.quit();
		}
}
