package day1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
@Test(priority=2)
public void test1() {
	Reporter.log("testuu",true);
}
@Test(priority=1, dependsOnMethods = {"test1"})
public void test2(){
	Reporter.log("testu1",true);
}
}
