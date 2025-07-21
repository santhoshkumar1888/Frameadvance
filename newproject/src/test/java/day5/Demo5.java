package day5;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class Sample1
{
	@FindAll({@FindBy(id="t1"),@FindBy(name="n3"),@FindBy(name="n1"),@FindBy(name="n2")})
	private List<WebElement> allElements;
	Sample1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	void setInput() throws InterruptedException
	{
		int i=1;
		for(WebElement element:allElements)
		{
			element.sendKeys("bhanu"+i);
			i++;
			Thread.sleep(1000);
		}
	}
	
}

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\AdvanceSeleWorkspace/sample.html");
		Sample1 s1=new Sample1(driver);
		s1.setInput();
		driver.close();
	}

}
