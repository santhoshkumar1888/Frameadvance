package day5;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

class SampleA
{
	@FindBy(tagName="td")
	private List<WebElement> allTDs;
	
	@FindAll({@FindBy(tagName="th"),@FindBy(tagName="td")})
	private List<WebElement> allCells;
	
	
	@FindBys({@FindBy(id="t1"),@FindBy(tagName="td")})
	private List<WebElement> allTDSofTable1;
	
	SampleA(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	void printTable()
	{
		for(WebElement td:allTDs)
		{
			System.out.println(td.getText());
		}
	}
	
	void printTable2()
	{
		for(WebElement cell:allCells)
		{
			System.out.println(cell.getText());
		}
	}
	
	void printTable3()
	{
		for(WebElement cell:allTDSofTable1)
		{
			System.out.println(cell.getText());
		}
	}
}
public class Demo7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\\\AdvanceSeleWorkspace/sample1.html");
		SampleA s2=new SampleA(driver);
//		s2.printTable();
//		s2.printTable2();
		s2.printTable3();
		driver.quit();
	}
}