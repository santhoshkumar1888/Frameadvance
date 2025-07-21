package day10;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.WebDriver;

public class MyWebDriverListener implements WebDriverListener {
	@Override
	public void beforeClick(WebElement element) {
        System.out.println("👉 About to click: " + element);
    }

    @Override
    public void afterClick(WebElement element) {
        System.out.println("✅ Clicked: " + element);
    }

    public void onError(Object target, Throwable throwable) {
        System.out.println("❌ Error occurred: " + throwable.getMessage());
    }

}
