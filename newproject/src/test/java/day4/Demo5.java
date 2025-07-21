package day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo5 {
//Return type of DataProvider: Object[], Object[][],Iterator<Object>, Iterator<Object[]>
	public static void main(String[] args) throws Exception {
		String path="./Data.xlsx",sheet="Sheet1";
		int rc=0,cc=0;
		ArrayList<String[]> list=new ArrayList<String[]>();
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		rc=wb.getSheet(sheet).getLastRowNum();
		for(int i=0;i<=rc;i++)
		{
			try {
					cc=wb.getSheet(sheet).getRow(i).getLastCellNum();
					String row[]=new String[cc];
					for(int j=0;j<cc;j++)
					{
						String v="";
						try 
						{
						  v=wb.getSheet(sheet).getRow(i).getCell(j).toString();
						}
						catch (NullPointerException e) {// blank cell
							System.err.println(e.getMessage());
						}
						row[j]=v;
					}
					list.add(row);
			}
			catch (NullPointerException e) {//blank row
				System.err.println(e.getMessage());
			}	
		}

		wb.close();
		
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
