package day3;

import org.testng.TestNG;

public class Demo7 {
	public static void main(String arg[]) throws ClassNotFoundException {
		TestNG testng=new TestNG();
		String cn = "day3.DemoB";
		Class cn1=Class.forName(cn);
		Class[] allclasses= {DemoA.class,cn1,DemoC.class};
		testng.setTestClasses(allclasses);
		testng.run();
	}

}
