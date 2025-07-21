package day3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class C{
	public static void m1() {
		System.out.println("m1 of c");
	}
	public int m2(int i,String s)
	{
		System.out.println("m2 of C with arg:"+i);
		return i;
	}
}

public class Demo3 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		Method m = C.class.getDeclaredMethod("m1");
		System.out.println(m.getName());
		System.out.println(Modifier.toString(m.getModifiers()));
		System.out.println(m.getReturnType());
		m.invoke(null);//calling the static methods using JRApi
		
		Method m2 = C.class.getDeclaredMethod("m2", int.class,String.class);
		System.out.println(m2.getName());
		System.out.println(Modifier.toString(m2.getModifiers()));
		System.out.println(m2.getReturnType());
		Object res = m2.invoke(new C(), 10,"Bhanu");
		System.out.println(res);

	}

}
