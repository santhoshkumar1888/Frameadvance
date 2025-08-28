package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.JSUtil;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		JSUtil.sendKeys(driver, user, "974097188");
	
		
		WebElement pass = driver.findElement(By.id("pass"));
		JSUtil.sendKeys(driver, pass, "Santhosh8@");
		
		WebElement loginbt = driver.findElement(By.xpath("//button[@name='login']"));
		JSUtil.click(driver, loginbt);
		Thread.sleep(5000);
		driver.quit();
	}

}
