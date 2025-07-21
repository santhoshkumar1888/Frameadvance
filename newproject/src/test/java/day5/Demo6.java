package day5;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

class sample2{
	//find all div-> 1 then find all inputs--> 4 total -5
		@FindAll({@FindBy(tagName = "div"),@FindBy(tagName = "input")})
		private List<WebElement> allElements; 
		
		//find all the inputs which are present inside the div--> 3
		@FindBys({@FindBy(tagName = "div"),@FindBy(tagName = "input")})
		private List<WebElement> allElements2;
		
		sample2(WebDriver driver){
			PageFactory.initElements(driver,this);
		}
		void count1() {
			System.out.println(allElements.size());
		}
		void count2() {
			System.out.println(allElements2.size());
		}
}

public class Demo6 {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\AdvanceSeleWorkspace/sample.html");
		sample2 s2=new sample2(driver);
		s2.count1();
		s2.count2();
		driver.close();
		

	}

}
