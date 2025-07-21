package day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {
	public static int getRowCount(String path,String sheet) {
		int rc=1;
		try {
			Workbook wb =WorkbookFactory.create(new FileInputStream(path));
			rc=wb.getSheet(sheet).getLastRowNum();
			wb.close();
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
		return rc;
	}
	public static int getColumnCount(String path,String sheet,int r) {
		int cc=0;
		try {
			Workbook wb =WorkbookFactory.create(new FileInputStream(path));
			cc=wb.getSheet(sheet).getRow(r).getLastCellNum();
			wb.close();
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
		return cc;
	}
	public static String getcelldata(String path,String sheet,int r,int c) {
		String v="";
		try {
			Workbook wb =WorkbookFactory.create(new FileInputStream(path));
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
			wb.close();
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
		return v;
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		 String v = getcelldata("./Data.xlsx","Sheet1",0,0);
		 System.out.println(v);
		 
		 System.out.println(getRowCount("./Data.xlsx","Sheet1"));
		 System.out.println(getColumnCount("./Data.xlsx","Sheet1",0));
	}

}
