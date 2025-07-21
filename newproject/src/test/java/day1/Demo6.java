package day1;

import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class Demo6 {
	public void TestA() {
		Reporter.log("TestA",true);
	}
	public void TestB() {
		Reporter.log("TestB",true);
	}
	public void TestC() {
		Reporter.log("TestC",true);
	}
}
