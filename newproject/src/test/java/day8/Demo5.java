package day8;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws IOException, AWTException {
		 WebDriver driver = new ChromeDriver();
        driver.get("https://www.actimind.com/");
        Robot robot=new Robot();
            Dimension destopsize = Toolkit.getDefaultToolkit().getScreenSize();
            System.out.println(destopsize);
            BufferedImage img = robot.createScreenCapture(new Rectangle(destopsize));
			ImageIO.write(img, "png", new File("./image/destop2.png"));
			driver.quit();

	}

}
