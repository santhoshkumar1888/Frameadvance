package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/*
 * @CacheLookup
 * find the element once and reuse the address
 * adv: faster
 * risk: we get SERE
 */
class LoginPage2
{
	@CacheLookup// find the element once and reuse the address
	@FindBy(id="username")
	private WebElement unTB;
	
	LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String un)
	{
		for(int i=1;i<=50;i++)
		{
			unTB.clear();
			unTB.sendKeys(un);//here
		}
	}
}

public class Demo2 {

	@Test
	public static void testA()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage2 l=new LoginPage2(driver);
		l.setUserName("bhanu");
	}

}

