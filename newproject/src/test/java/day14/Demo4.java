package day14;

import java.awt.MouseInfo;
import java.awt.Point;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		Thread.sleep(4000);//move mouse pointer to req location
		Point location = MouseInfo.getPointerInfo().getLocation();
		double x=location.getX();
		System.out.println(x);
		double y=location.getY();
		System.out.println(y);
		driver.quit();

	}

}
