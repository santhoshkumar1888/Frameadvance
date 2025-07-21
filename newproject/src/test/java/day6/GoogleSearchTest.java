package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class GoogleSearchTest {

    public static class CustomListener extends AbstractWebDriverEventListener {
        @Override
        public void beforeNavigateTo(String url, WebDriver driver) {
            System.out.println("Navigating to: " + url);
        }

        @Override
        public void afterClickOn(WebElement element, WebDriver driver) {
            System.out.println("Clicked element: " + element.getTagName());
        }

        @Override
        public void beforeFindBy(By by, WebElement element, WebDriver driver) {
            System.out.println("Trying to find element: " + by.toString());
        }

        @Override
        public void onException(Throwable throwable, WebDriver driver) {
            System.out.println("Exception occurred: " + throwable.getMessage());
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver baseDriver = new ChromeDriver();

        // Decorate with listener
        CustomListener listener = new CustomListener();
        WebDriver driver = new EventFiringDecorator<>(listener).decorate(baseDriver);
        EventFiringDecorator<>(listener).

        try {
            driver.get("https://www.google.com");

            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium WebDriver");
            searchBox.submit();

            // Wait for result titles to appear
            Thread.sleep(2000); // Use explicit wait in real tests

            System.out.println("Page title is: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
