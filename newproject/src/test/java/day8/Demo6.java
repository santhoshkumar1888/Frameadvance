package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ScreenShot;

public class Demo6 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actimind.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//img[@class='header__logo']"));
		ScreenShot.takeElementScreenShot(element, "./image/element.png");
		ScreenShot.takePageScreenShot(driver, "./image/page.png");
		ScreenShot.takeCompletePageScreenShot(driver, 1, "./image/fullpage.png");
		ScreenShot.takeDesktopScreenShot("./image/desktop.png");
		driver.quit();
	}
}
