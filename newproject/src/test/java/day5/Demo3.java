package day5;

import java.time.Duration;
import java.util.LinkedHashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	public static void login(String un,String pw) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pw);
		driver.findElement(By.name("login")).click();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.titleIs("facebook"));
		Reporter.log(driver.getTitle(),true);
		driver.quit();
	}
	
	@Test
	public void testA() { int rc = day4.Demo1.getRowCount("./login.xlsx","Sheet2");
	for(int i=1;i<=rc;i++)
	{
		LinkedHashMap<String, String> data = Demo1.getDatatomap("./login.xlsx","Sheet2",i);
		String un=data.get("UserName");
		String pw=data.get("Password");
		login(un,pw);
	}
	}

}
