package day2;

import org.testng.TestNG;

public class Mysuite3 {

	public static void main(String[] args) {
		Class[] allTest= {Demo1.class,Demo2.class,Demo3.class};
		TestNG testng=new TestNG();
		testng.setTestClasses(allTest);
		testng.run();
	}

}
