package utility;

import java.awt.MouseInfo;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.Set;


public class Util {


	public static String getTimeStamp()
	{
		 LocalDateTime currentDateTime = LocalDateTime.now();
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
	     String formattedDateTime = currentDateTime.format(formatter);
	     return formattedDateTime;
	}
	
	public static void getMouseLocation()
	{
		try {
			Thread.sleep(4000);//move mouse pointer to req location
			java.awt.Point location = MouseInfo.getPointerInfo().getLocation();
			double x=location.getX();
			System.out.println(x);
			double y=location.getY();
			System.out.println(y);
		}
		
		catch (Exception e) 
		{
			
		}
	}
}
