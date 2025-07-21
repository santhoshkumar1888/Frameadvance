package day3;


import java.util.ArrayList;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.TestNG;

public class Demo11 {
	public static ArrayList<String> getdatafromxl() {
		String packageName = Demo11.class.getPackage().getName();
		ArrayList<String> list = new ArrayList<String>();
		try
		{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./suite1.xlsx"));
		int rc=wb.getSheet("Sheet1").getLastRowNum();
		for(int i=1; i<=rc; i++) {
			 String v = wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			list.add(packageName+"."+v);
		}
		wb.close();
		}
		catch(Exception e) {
		}
		return list;
		}

	public static void main(String[] args) throws ClassNotFoundException {
		ArrayList<String> allclasses = Demo11.getdatafromxl();
		int n=allclasses.size();
		Class[] allclass=new Class[n];
		for(int v=0; v<n; v++) {
			String cn = allclasses.get(v);
			Class c1 = Class.forName(cn);
			allclass[v]=c1;
		}
		TestNG testng = new TestNG();
		testng.setTestClasses(allclass);
		testng.run();
	}
}
