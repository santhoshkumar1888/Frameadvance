package day18;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo2 {
	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("http://localhost:4444");
//		ChromeOptions options=new ChromeOptions();
		EdgeOptions options=new EdgeOptions();
		
		WebDriver driver=new RemoteWebDriver(url, options);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}


}
