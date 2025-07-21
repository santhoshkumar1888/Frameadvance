package day6;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

class X implements WebDriverListener
{
	public void beforeAnyCall(Object target, Method method, Object[] args)  
	{
		System.out.println("Hi");
	}
	
	public void afterAnyCall(Object target, Method method, Object[] args, Object result)  {
		System.out.println("Bye");
	}
}
public class DemoA {

	public static void main(String[] args) {
			WebDriver original=new ChromeDriver();
			EventFiringDecorator<WebDriver> eDriver=new EventFiringDecorator<WebDriver>(new X());
			WebDriver driver = eDriver.decorate(original);
			driver.get("http://www.google.com");
			driver.quit();
			
	}

}
