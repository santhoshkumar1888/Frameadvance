package day14;

import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actimind.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String xp="//div[contains(text(),'Create Stunning UI/UX Design with Actimind')]";
		Point loc = driver.findElement(By.xpath(xp)).getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		Thread.sleep(4000);//move mouse pointer to req location
		java.awt.Point location = MouseInfo.getPointerInfo().getLocation();
		double x=location.getX();
		System.out.println(x);
		double y=location.getY();
		System.out.println(y);
		driver.quit();

	}

}
