package day6;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class WebDriverFactory{
    public static WebDriver create(String browser,int time,String url){
    WebDriver driver=null;
    browser=browser.toLowerCase();
    switch(browser){
        case "chrome":
        driver=new ChromeDriver();
        break;
        case "Firefox":
        driver= new FirefoxDriver();
        break;
         default:
         driver=new EdgeDriver();
         break;
    }
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    driver.get(url);
    return driver;
}
}

public class Demo5 {
    public static void main(String[] arg){
     WebDriver driver=WebDriverFactory.create("firefox",5,"http://www.google.com");
    driver.close ();
    }
    
}
