package day19;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Demo3 {

	@Parameters({"docker","browser"})
	@Test
	public  void test3(String docker,String browser) throws MalformedURLException, InterruptedException {
		WebDriver driver;
		if(browser.equals("chrome")) {
			driver=new RemoteWebDriver(new URL("http://localhost:4444"),new ChromeOptions());
		}else {
			driver=new RemoteWebDriver(new URL("http://localhost:4455"),new FirefoxOptions());
		}

		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("9740971888");
		driver.findElement(By.id("pass")).sendKeys("santhosh8");
		driver.findElement(By.name("login")).click();
		Thread.sleep(7000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
