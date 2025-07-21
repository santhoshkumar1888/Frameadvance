package day2;

import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;
import org.testng.TestNG;

public class Mysuite4 {

	public static void main(String[] args) throws Exception {
		ArrayList<Class> list = new ArrayList<Class>();
		Workbook wb = WorkbookFactory.create(new FileInputStream("./suite.xlsx"));
		int rc=wb.getSheet("Sheet1").getLastRowNum();
		for (int i=1; i<=rc; i++)
		{
			String ClassName=wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			String classstatus=wb.getSheet("Sheet1").getRow(i).getCell(1).toString();
			if(classstatus.equalsIgnoreCase("Yes")) {
				Class c;
				if(ClassName.equals("Demo1")) {
					c=Demo1.class;
				}else if(ClassName.equals("Demo2")) {
					c=Demo2.class;
				}else {
					c=Demo3.class;
				}
				list.add(c);
			}
		}
		wb.close();
		int count=list.size();
		Class[] allTestclass = new Class[count];
		for(int i=0; i<count; i++)
		{
			allTestclass[i]=list.get(i);
		}
		
		TestNG testng=new TestNG();
		testng.setTestClasses(allTestclass);
		testng.run();
	}

}
