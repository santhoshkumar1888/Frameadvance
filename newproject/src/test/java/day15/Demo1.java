package day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.RoboUtil;

public class Demo1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.id("APjFqb")).sendKeys("java");
//		driver.switchTo().activeElement().sendKeys("java");
//		JavascriptExecutor j=(JavascriptExecutor)driver;
//		j.executeScript("document.getElementById('APjFqb').value='java'");

		RoboUtil.enter("java", false);
	}

}
