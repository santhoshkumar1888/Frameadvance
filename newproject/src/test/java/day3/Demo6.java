package day3;

import java.lang.reflect.Method;
import java.util.Scanner;

class F
{
	public static void m1()
	{
		System.out.println("m1() of F class");
	}
	
	public static void m2()
	{
		System.out.println("m2() of F class");
	}
}
class G
{
	public static void m1()
	{
		System.out.println("m1() of G class");
	}
	
	public static void m2()
	{
		System.out.println("m2() of G class");
	}
}
public class Demo6 {

	public static void main(String[] args)  throws Exception{
		//call req 'methodName' present inside given 'className' --day3.G
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter FCQN:");
		String className=sc.next();
		
		System.out.println("Please enter method name:");
		String methodName=sc.next();
		sc.close();
		
		Class cls=Class.forName(className);
		Method m = cls.getDeclaredMethod(methodName, null);
		m.invoke(null);
		
		
	}

}
