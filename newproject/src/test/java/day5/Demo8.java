package day5;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

class SampleB
{
	//find all th & all td which are inside the t1 table
	@FindBys({@FindBy(id="t2"),@FindBy(xpath=".//th|.//td")})
	private List<WebElement> allCells;
	
	SampleB(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	void printTable()
	{
		for(WebElement cell:allCells)
		{
			System.out.println(cell.getText());
		}
	}
	
}
public class Demo8 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\AdvanceSeleWorkspace/sample1.html");
		SampleB s=new SampleB(driver);
		s.printTable();
		driver.quit();
	}

}

