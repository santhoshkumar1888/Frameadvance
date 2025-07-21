package day8;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Demo3 {
    public static void main(String[] args) throws IOException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.actimind.com/");
        driver.manage().window().maximize();
        AShot ashot=new AShot();
      //how to take?-->scroll after every 1sec and take screenshot
        ShootingStrategy s = ShootingStrategies.viewportPasting(1100);
        Screenshot screenshoot = ashot.shootingStrategy(s).takeScreenshot(driver);
        ImageIO.write(screenshoot.getImage(), "png", new File("./image/actimind1.png"));
        driver.close();
    }

}
