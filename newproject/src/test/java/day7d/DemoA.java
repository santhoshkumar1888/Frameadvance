package day7d;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoA {
	//what we can receive-> ITestContext,XmlTest,Method,Object[]
	@BeforeMethod 
	public void m1(Method m)
	{
		String testname = m.getName();
		System.out.println("Hi: i will execute:"+testname);
	}
	
	//we can receive->ITestResult,XmlTest,Method
	@AfterMethod
	public void m2(ITestResult result)
	{
		String testname=result.getName();
		int status = result.getStatus();
		if(status==1)
		{
			System.out.println(testname+" is PASSED");
		}
		else if(status==2)
		{
			System.out.println(testname+" is FAILED");
		}
		else
		{
			System.out.println(testname+" is SKIPPED");
		}
		
	}
	//we can rcv--> ITestContext
	@Test
	public void testA()
	{
		System.out.println("TestA of DemoA");
	}
	
	@Test
	public void testB()
	{
		System.out.println("TestB of DemoA");
		Assert.fail();
	}
}

