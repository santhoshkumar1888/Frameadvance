package day9;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo2 {
	public static void main(String[] args) {
		String img="../image/google1.png";
		
		//DONE create ER object-1
		ExtentReports report=new ExtentReports();
		//DONE Create format object- SPRAK & attach it-1
		ExtentSparkReporter spark=new ExtentSparkReporter("target/Spark.html");
				report.attachReporter(spark);
				
				ExtentTest Test1=report.createTest("ValidScenario");
				
				Test1.skip("Skip the test5");
				Test1.warning("Warning");
				Test1.pass("This is pass");
				Test1.info("Test info");
				Test1.info("Test info");Test1.info("Test info");Test1.info("Test info");
				Test1.fail("This failed",MediaEntityBuilder.createScreenCaptureFromPath(img).build());
				Test1.info("Test info");Test1.info("Test info");
				
				ExtentTest Test2=report.createTest("Invalidscenario");
				Test2.fail("This invalid/failed");
				Test2.addScreenCaptureFromPath(img, "Full screen");
		
			
				
				//DONE generates the report-1
				report.flush();
	}
	

}
