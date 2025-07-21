package day2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class A{
	int i=18;
	public static final String s="santhosh";
	protected boolean b=true;
}

public class Demo4 {
	public static void main(String arg[]) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	A a1=new A();
	
	Field[] allVars = A.class.getDeclaredFields();
	 Field v = A.class.getDeclaredField("s");
	 System.out.println(v);
	 System.out.println(allVars.length);
	 for (Field var:allVars) {
		 System.out.println(var.getName());
		 System.out.println(var.getType());
		 System.out.println(var.get(a1));
		 int modifier = var.getModifiers();
		 System.out.println(Modifier.toString(modifier));
		 System.out.println(var);
		 System.out.println("---------------");
		 
	 }
}
}
