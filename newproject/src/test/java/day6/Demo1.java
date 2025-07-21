package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

class LoginPage
{

	@FindBy(id="username1")
	private WebElement unTB;
	
	LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String un)
	{
//		unTB.sendKeys(un);//here
	}
}

public class Demo1 {

	@Test
	public static void testA()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l=new LoginPage(driver);
		l.setUserName("sant");
	}

}
