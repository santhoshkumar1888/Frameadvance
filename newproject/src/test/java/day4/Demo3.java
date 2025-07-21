package day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3 {
//Return type of DataProvider: Object[], Object[][],Iterator<Object>, Iterator<Object[]>
	public static void main(String[] args) throws Exception {
		String path="./Data.xlsx",sheet="Sheet1";
		int rc=0,cc=0;
		
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		rc=wb.getSheet(sheet).getLastRowNum();
		for(int i=0;i<=rc;i++)
		{
			try {
					cc=wb.getSheet(sheet).getRow(i).getLastCellNum();
					for(int j=0;j<cc;j++)
					{
						try {
								String v=wb.getSheet(sheet).getRow(i).getCell(j).toString();
								System.out.print(v+" ");
						}
						catch (NullPointerException e) {// blank cell
							System.out.print("-");
						}
					}
					System.out.println();
			}
			catch (NullPointerException e) {//blank row
				System.out.println("----");
			}	
		}

		wb.close();
	}

}
