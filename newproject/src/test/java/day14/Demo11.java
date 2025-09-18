package day14;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Util;

public class Demo11 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		
	}

}
