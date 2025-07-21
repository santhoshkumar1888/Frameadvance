package day7b;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Excel;

public class TestListener implements ITestListener
{

	public void onTestStart(ITestResult result) {
		System.out.println("Started executing the Test Method");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Method is Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Method is Failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Method is Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Test Method is On Start");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Method is Finished");
		
	}

	

}
