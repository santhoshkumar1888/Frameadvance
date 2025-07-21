package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class Demo2 {

	public static void script1(WebDriver driver)
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.quit();
	}
	
	public static void main(String[] args) {
		
		WebDriver original_driver=new ChromeDriver();
		EventFiringDecorator<WebDriver> decorator=new EventFiringDecorator<WebDriver>(new ReporterListener1());
		WebDriver driver = decorator.decorate(original_driver);
		
		script1(driver);

	}
}
