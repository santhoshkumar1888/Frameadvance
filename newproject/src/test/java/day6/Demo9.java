package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo9 {
	public static void script1(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}
    public static void main(String[] args){
         System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        script1(driver);
        
        System.setProperty("webdriver.edge.driver", ".\\driver\\msedgedriver.exe");
        WebDriver driver1=new EdgeDriver();
        script1(driver1);
    }

}
