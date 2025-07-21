package day1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test(priority=2)
	public void TestA() {
		Reporter.log("TestAResult",true);
	}
	
	@Test(priority=1)
	public void TestB() {
		Reporter.log("TestBResult",true);
		
	}
}
