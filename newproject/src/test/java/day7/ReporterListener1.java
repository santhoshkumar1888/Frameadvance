package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class ReporterListener1 implements WebDriverListener {
	public  void beforeGet(WebDriver driver, String url) {
		System.out.println("Entering the URL:"+url);
	}
	 
	public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
		System.out.print("Entering the input as:");
		for(CharSequence c:keysToSend)
		{
			System.out.println(c);
		}
	}
	public void beforeClick(WebElement element) {
		System.out.println("Clicking on the element");
	}
	 
	public void beforeQuit(WebDriver driver) {
		System.out.println("Closing the browser");
	}
}
