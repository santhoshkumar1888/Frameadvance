package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class ListenerTest {

	public static void main(String[] args) {
		WebDriver baseDriver = new ChromeDriver();

        MyWebDriverListener listener = new MyWebDriverListener();
        WebDriver driver = new EventFiringDecorator<>(listener).decorate(baseDriver);

        driver.get("https://www.google.com");
        driver.quit();

	}

}
