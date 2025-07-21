package day3;

import org.testng.TestNG;

public class Demo8 {

	public static void main(String[] args) throws ClassNotFoundException {
		TestNG testng=new TestNG();
		String cn = "day3.DemoA";
		Class c1=Class.forName(cn);
		
		Class c2=Class.forName("day3.DemoB");
		Class c3=Class.forName("day3.DemoC");
		Class[] allClass= {c1,c2,c3};
		testng.setTestClasses(allClass);
		testng.run();


	}

}
