package day1;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
	}
	
	@Test(invocationCount=2)
	public void TestA(){
		Reporter.log("Test123",true);
	}
	
		@Test
		public void TestB() {
			for(int i=0; i<=3; i++) {
			Reporter.log("Test321",true);
			}
		}
		

}
