package day5;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class LoginPage{
	final String un="email";
	@FindBy(id=un)
	private WebElement unTB;
	
	@FindBy(xpath="//a")
	private List<WebElement> alllinks;
	
	
	LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	void setusername(String un) {
		unTB.sendKeys(un);
	}
	void countlinks() {
		System.out.println(alllinks.size());
	}
}

public class Demo4 {
	
	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		LoginPage l=new LoginPage(driver);
		l.setusername("97409");
		l.countlinks();
		driver.quit();
		
	}

}
