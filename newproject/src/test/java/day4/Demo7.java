package day4;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo7 {
	@DataProvider
	public Iterator<String[]> getdata() {
		ArrayList<String[]> list=new ArrayList<String[]>();
		String[]a= {"A1","B1","C1"};
		list.add(a);
		
		String[]b= {"A1","B1","C1"};
		list.add(b);
		return list.iterator();
	}
	
	@Test(dataProvider="getdata")
	public void TestA(String a,String b,String c)
	{
		Reporter.log(a+"-"+b+"-"+c,true);
	}

}
