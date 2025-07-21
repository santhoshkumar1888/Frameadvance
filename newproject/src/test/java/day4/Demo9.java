package day4;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo9 {
	//if number of row is dynamic , it will handle,
	//if number of columns are dynamic use var args
	@DataProvider
	public Iterator<String[]> getdata() {
		ArrayList<String[]> list=new ArrayList<String[]>();
		String[]a= {"A1","B1","C1"};//add 3 columns
		list.add(a);
		
		String[]b= {"A1","B1"};//add 2 columns
		list.add(b);
		return list.iterator();
	}
	
	@Test(dataProvider="getdata")
	public void TestA(String... a)//num of col is dynamic so use var arg
	{
		for(String s:a) {
		Reporter.log(s,true);
		}
	}


}
