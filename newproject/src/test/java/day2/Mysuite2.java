package day2;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Factory;
import java.io.FileInputStream;

import java.util.ArrayList;

public class Mysuite2 {
	@Factory
	public Object[] createSuite() throws Exception
	{
		ArrayList<Object> list=new ArrayList<Object>();
		Workbook wb = WorkbookFactory.create(new FileInputStream("./suite.xlsx"));
		int rc=wb.getSheet("Sheet1").getLastRowNum();
		for(int i=1;i<=rc;i++)
		{
			String className=wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			String classStatus=wb.getSheet("Sheet1").getRow(i).getCell(1).toString();
			if(classStatus.equalsIgnoreCase("yes"))
			{
				Object obj;
				if(className.equals("Demo1"))
				{
					 obj=new Demo1();
					
				}
				else if(className.equals("Demo2"))
				{
					 obj=new Demo2();
				}
				else
				{
					 obj=new Demo3();
				}
				
				list.add(obj);
			}
			
		}
		wb.close();
		Object[] allTests = list.toArray();//convert array list into array
		return allTests;
	}

}
