package day16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

class WebUtil
{
	public static void enter(WebDriver driver,String xpath,String input)
	{
		System.out.println("You have called enter method");
	}
	
	public static void click(WebDriver driver,String xpath)
	{
		System.out.println("You have called click method");
	}
	
	public static void select(WebDriver driver,String xpath)
	{
		System.out.println("You have called select method");
	}
}
public class Demo1 {

	public static void main(String[] args) throws Exception {
//		WebUtil w=new WebUtil();
		WebDriver driver=null;
		String keyword1="select";
		String keyword2="//input[@id='username']";
		String Keyword3="admin";
		
		Method[] allMethods = WebUtil.class.getDeclaredMethods();
		for(Method method:allMethods)
		{
			String actualMethodName=method.getName();
			int count=method.getParameterCount();
//			System.out.println("Method is:"+actualMethodName+" and num of argument is "+count);
			if(actualMethodName.equalsIgnoreCase(keyword1))
			{
				if(count==2)
				{
					method.invoke(null,driver,keyword2);
				}
				else
				{
					method.invoke(null,driver,keyword2,Keyword3);
				}
				
			}
		}

	}

}
