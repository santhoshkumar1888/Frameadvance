package day13;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demo12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		
		j.executeScript("arguments[0].value=arguments[1]",user,"974097188");
		
		WebElement pass = driver.findElement(By.id("pass"));
		j.executeScript("arguments[0].value=arguments[1]",pass,"Santhosh8@");
		
		Thread.sleep(5000);
		WebElement loginbt = driver.findElement(By.xpath("//button[@name='login']"));
		j.executeScript("arguments[0].click()",loginbt);
	}
}
