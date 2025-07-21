package day11;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer
{
	public int count=0;
	public boolean retry(ITestResult result) {
		String methodName = result.getName();
		
		System.out.println("We are inside retry method");
		System.out.println("The failed method is: "+methodName);
		if(count<1)//how many times to rerun failed
		{
			count++;
			return true;//true- rerun again 
		}
		else
		{
			System.out.println("Already re-executed, hence stoping it");
			return false;//false - dont rerun
		}
	}

}
