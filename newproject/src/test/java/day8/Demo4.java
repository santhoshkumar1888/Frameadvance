package day8;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

    public static void main(String[] args) throws AWTException, Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.actimind.com/");
        Robot robot=new Robot();
        Rectangle r=new Rectangle(10,10,1000,1080);
		BufferedImage img = robot.createScreenCapture(r);
		ImageIO.write(img,"png", new File("./image/desktop.png"));
		driver.quit();
        
    }
}
