package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.JSUtil;

public class Demo15 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'How We Create Exceptional')]"));
		JSUtil.scrollToElement(driver, element);
		Thread.sleep(3000);
		driver.close();

	}

}
