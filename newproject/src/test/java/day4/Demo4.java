package day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo4 {
//Return type of DataProvider: Object[], Object[][],Iterator<Object>, Iterator<Object[]>
	public static void main(String[] args) throws Exception {
	
		
		ArrayList<String[]> list=new ArrayList<String[]>();
		String[] a= {"A1","B1","C1"};
		list.add(a);
		
		String[] b= {"A2","B2","C2"};
		list.add(b);
		
		String[] c= {"A3","B3","C3"};
		list.add(c);
		
		for(String[] row:list)
		{
			for(String cell:row)
			{
				System.out.print(cell+" ");
			}
			System.out.println();
		}
		
	}

}
