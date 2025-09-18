package day18;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1 {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		URL url=new URL("http://localhost:4444");
//		HttpGet request = new HttpGet("http://localhost:4444");

//		in Selenium 3 use below object as 2nd arg
//		DesiredCapabilities dc=new DesiredCapabilities();
//		dc.setBrowserName("chrome");
		
		ChromeOptions options=new ChromeOptions();
//		FirefoxOptions options=new FirefoxOptions();
//		EdgeOptions options=new EdgeOptions();
		
		WebDriver driver=new RemoteWebDriver(url, options);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();

}
}