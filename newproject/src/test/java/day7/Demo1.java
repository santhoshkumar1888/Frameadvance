package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.ui.Wait;

public class Demo1 {

	public static void script1(WebDriver driver)
	{
		driver.get("https://google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		driver.findElement(By.className("gNO89b")).click();
        driver.findElement(By.className("lnnVSe")).click();
        driver.findElement(By.id("recaptcha-anchor")).click();
		// driver.quit();
	}
	
	public static void main(String[] args) {
		
		WebDriver original_driver=new ChromeDriver();
		EventFiringDecorator<WebDriver> decorator=new EventFiringDecorator<WebDriver>(new ReporterListener1());
		WebDriver driver = decorator.decorate(original_driver);
		
		script1(driver);

	}
}