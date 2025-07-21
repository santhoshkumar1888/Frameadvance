package day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import day4.Demo6;

public class Demo2 {
	
	public static void login(String un,String pw) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pw);
		driver.findElement(By.name("login")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("facebook"));
		Reporter.log(driver.getTitle(),true);
		driver.quit();
	}
	
	@DataProvider
	public Iterator<String[]> getData()
	{
		ArrayList<String[]> list=Demo6.getsheetdatalist("./login.xlsx","Sheet1");	
		return list.iterator();
	}
	@Test(dataProvider="getData")
	public void testA(String un,String pw) {
		
		login(un, pw);
	}

}
