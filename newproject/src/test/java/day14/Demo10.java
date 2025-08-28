package day14;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Util;

public class Demo10 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().window().maximize();
		Util.getMouseLocation();
		Thread.sleep(2000);
		Robot r=new Robot();
//		r.mouseMove(624, 284);
//		Thread.sleep(1000);
//		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(1000);
//		r.mouseMove(928, 284);
//		Thread.sleep(1000);
//		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		RoboUtil.dragAndDrop(624, 284, 928, 284);
		}

}
