package day12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("santhosh");
		driver.quit();
	}

}
