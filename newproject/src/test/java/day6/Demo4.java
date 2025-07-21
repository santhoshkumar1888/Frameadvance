package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Browser 
{
	private static WebDriver driver=null;
	private Browser()
	{
		
	}
	
	public static WebDriver openBrowser()
	{
		if(driver==null)
		{
			driver=new ChromeDriver();
			return driver;
		}
		else
		{
			return driver;
		}
	}
}
public class Demo4 {

	public static void main(String[] args) {
		System.out.println("Start");
		WebDriver driver=Browser.openBrowser();
		WebDriver driver2=Browser.openBrowser();
		System.out.println("End");
		driver.quit();
		
	}

}
