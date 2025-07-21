package day5;

import java.io.FileInputStream;
import java.util.LinkedHashMap;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {
public static LinkedHashMap<String, String> getDatatomap(String path,String sheet,int row)  {
	
	LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();
	
	try {
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	int cc=wb.getSheet(sheet).getRow(row).getLastCellNum();
	for(int i=0; i<=cc; i++) {
		String key = wb.getSheet(sheet).getRow(0).getCell(i).toString();
		String value = wb.getSheet(sheet).getRow(row).getCell(i).toString();
		map.put(key,value);
	}
	wb.close();
	}catch(Exception e) {
		System.err.println(e.getMessage());
	}
	return map;
	
	
}
public static void main(String[] args) {
	LinkedHashMap<String, String> map = getDatatomap("./Data.xlsx", "Sheet2", 1);
	System.out.println(map);
}
}
