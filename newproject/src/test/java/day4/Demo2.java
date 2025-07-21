package day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {
	public static void writeDataToCell(String path,String sheet,int r,int c,String value)
	{
		try {	
				Workbook wb = WorkbookFactory.create(new FileInputStream(path));
				try 
				{
					wb.getSheet(sheet).createRow(r).createCell(c).setCellValue(value);
				}
				catch (NullPointerException e) 
				{
					wb.getSheet(sheet).createRow(r).createCell(c).setCellValue(value);
				}
				wb.write(new FileOutputStream(path));
				wb.close();
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
		}
		
	}
	public static void main(String[] args) throws Exception {
		writeDataToCell("./Data.xlsx","Sheet1",1,1,"Bhanu");
		
	}

}
