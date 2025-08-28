package day14;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Util;

public class Demo8 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
//	Util.getMouseLocation();
		Robot r=new Robot();
		r.mouseMove(574,349);
		Thread.sleep(2000);
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		Thread.sleep(3000);
		driver.quit();

	}

}
