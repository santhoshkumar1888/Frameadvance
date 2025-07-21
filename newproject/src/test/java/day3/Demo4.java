package day3;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class D{
	public static void m1() {
		System.out.println("m1 of c");
	}
	public int m2(int i,String s) {
		System.out.println("m2 of c with arg:"+i);
		return i;
	}
}
public class Demo4 {
public static void main(String arg[]) throws Exception {
	Method[] allmethods = D.class.getDeclaredMethods();
	for (Method m:allmethods) {
		System.out.println(m.getName());
		System.out.println(Modifier.toString(m.getModifiers()));
		System.out.println(m.getReturnType());
		int pCount = m.getParameterCount();
		System.out.println(pCount);
		if(pCount==2)
		{
			Object res = m.invoke(new D(), 10,"Bhanu");
			System.out.println(res);
		}
		else
		{
m.invoke(new D(),null);
		}
		
	}
}
}
