package day14;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.irctc.co.in");
			driver.manage().window().maximize();
			Thread.sleep(3000);
	Robot r=new Robot();
	r.mouseMove(370,200);
	Thread.sleep(1000);
	r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	Thread.sleep(1000);
	r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	Thread.sleep(1000);
	r.mouseMove(680,680);
	Thread.sleep(1000);
	r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	driver.quit();	
	}

}
