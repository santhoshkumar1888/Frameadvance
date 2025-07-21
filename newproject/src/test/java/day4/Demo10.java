package day4;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo10 {
@DataProvider
	public Iterator<String[]> getdata() {
		ArrayList<String[]> list=Demo6.getsheetdatalist("./Data.xlsx", "Sheet1");
		return list.iterator();
	}
@Test(dataProvider="getdata")
	public void testA(String... a) {
		for(String s:a) {
			Reporter.log(s,true);
		}
	}
}
