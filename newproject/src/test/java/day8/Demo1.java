package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

    public static void main(String[] args) throws IOException{
WebDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
//         WebElement element= driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']//*[name()='svg']"));
         WebElement element= driver.findElement(By.className("lnXdpd"));
         File srcFile=element.getScreenshotAs(OutputType.FILE);
        File destFile=new File("./image/google1.png");
        FileUtils.copyFile(srcFile, destFile);
        driver.quit();

    }
}
