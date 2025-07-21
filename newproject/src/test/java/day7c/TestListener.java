package day7c;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Excel;

public class TestListener implements ITestListener
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		String methodName=result.getName();
		System.out.println(methodName+"is Passed");
		int rc = Excel.getRowCount("./Report.xlsx", "Sheet1");
		Excel.writeDataToCell("./Report.xlsx", "Sheet1", rc+1, 0, methodName);
		Excel.writeDataToCell("./Report.xlsx", "Sheet1", rc+1, 1, "Passed",false);
		
		
	}

	public void onTestFailure(ITestResult result) {
		String methodName=result.getName();
		System.out.println(methodName+"is Passed");
		int rc = Excel.getRowCount("./Report.xlsx", "Sheet1");
		Excel.writeDataToCell("./Report.xlsx", "Sheet1", rc+1, 0, methodName);
		Excel.writeDataToCell("./Report.xlsx", "Sheet1", rc+1, 1, "Failed",true);
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

}
