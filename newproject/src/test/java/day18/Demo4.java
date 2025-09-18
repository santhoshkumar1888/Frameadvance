package day18;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo4 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		URL url=new URL("https://oauth-santuu888-7a622:31721330-1255-410c-ba0e-6558d9b6467a@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setCapability("name", "ValidLogin");
		WebDriver driver=new RemoteWebDriver(url, dc);
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(7000);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
