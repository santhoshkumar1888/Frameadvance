package day3;

import java.util.ArrayList;

import org.testng.TestNG;

public class Demo9 {

	public static void main(String[] args) throws ClassNotFoundException {
		ArrayList<String> allclasses = new ArrayList<String>();
		allclasses.add("day3.DemoA");
		allclasses.add("day3.DemoB");
		allclasses.add("day3.DemoC");
		int n=allclasses.size();
		Class[] allclass=new Class[n];
		for(int v=0; v<n; v++) {
			String cn = allclasses.get(v);
			Class c1 = Class.forName(cn);
			allclass[v]=c1;
		}
		TestNG testng = new TestNG();
		testng.setTestClasses(allclass);
		testng.run();

	}

}
