package day4;

import java.io.FileInputStream;
import java.util.ArrayList;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo6 {
	
	public static ArrayList<String[]> getsheetdatalist(String path,String sheet) {
		
		ArrayList<String[]> list=new ArrayList<String[]>();
		try {
				Workbook wb = WorkbookFactory.create(new FileInputStream(path));
				int rc=wb.getSheet(sheet).getLastRowNum();
				for(int i=1;i<=rc;i++)
				{
					try {
							int cc=wb.getSheet(sheet).getRow(i).getLastCellNum();
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
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return list;
	}
		
	//Return type of DataProvider: Object[], Object[][],Iterator<Object>, Iterator<Object[]>
	public static void main(String[] args) throws Exception {
		String 	path="./Data.xlsx",sheet="Sheet1";
		ArrayList<String[]> list = getsheetdatalist(path,sheet);
		
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
