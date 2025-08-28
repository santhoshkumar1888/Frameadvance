package day14;

import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
//mouse hover using Robot class
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actimind.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.mouseMove(1586,765);
		Thread.sleep(3000);
		driver.quit();

	}

}
