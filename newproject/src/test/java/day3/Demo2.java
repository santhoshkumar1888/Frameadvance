package day3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class B{
	public static final int j=22;
	protected String s="Auto";
	
}

public class Demo2 {
public static void main(String arg[]) throws IllegalArgumentException, IllegalAccessException {
	B b = new B();
	Field[] allVar = B.class.getDeclaredFields();
	
	for(Field var:allVar)
	{
		System.out.println(var.getName());
		System.out.println(var.getType());
		System.out.println(var.get(b));
		System.out.println(Modifier.toString(var.getModifiers()));
		System.out.println("----");
	}
}
}
