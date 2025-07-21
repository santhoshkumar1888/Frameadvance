package day9;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {

	@BeforeMethod
	public void m1()
	{
		Reporter.log("This is Before method m1",true);
	}
	@Test
	public void testA()
	{
		Reporter.log("this is testA",true);
	}
	
	@AfterMethod
	public void m2()
	{
		Reporter.log("This is After method m2",true);
	}
}
