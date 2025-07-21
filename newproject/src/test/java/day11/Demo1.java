package day11;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo1 {
	static Scanner sc;
	@BeforeSuite
	public void m1()
	{
		sc=new Scanner(System.in);
		
	}
	
	@AfterSuite
	public void m2()
	{
		sc.close();
	}
	@Test(priority = 1,retryAnalyzer = Retry.class)
	public void testA() throws InterruptedException
	{
		Reporter.log("TestA...",true);
		Thread.sleep(1000);
		System.out.println("Please enter input:");
		String av=sc.next();
		Thread.sleep(1000);
		
		Assert.assertEquals(av, "abcd");
		
	}
	
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void testB() throws InterruptedException
	{
		Reporter.log("TestB...",true);
		Thread.sleep(1000);
		System.out.println("Please enter input:");
		String av=sc.next();
		Thread.sleep(1000);
		
		Assert.assertEquals(av, "abcd");
		
	}
}
