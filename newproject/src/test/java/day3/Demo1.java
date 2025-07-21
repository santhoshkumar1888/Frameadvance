package day3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class A
{
	public static final int i=10;
	
	protected String s="Bhanu";
}
public class Demo1 {

	public static void main(String[] args) throws Exception {
		//I want to access content of 'A' class programatically
		//i use java reflection API
		//Object Class Method Field..
		
		Object obj=new A();
		Class cls=A.class;
		
		System.out.println(obj);
		System.out.println(cls);
		
		//i want to access i variable present in class A
		Field var = A.class.getDeclaredField("i");
		System.out.println(var.getName());//var name i
		System.out.println(var.getType());//var datatype int
		System.out.println(var.getInt(null));//var value 10
		int m = var.getModifiers();
		System.out.println(Modifier.toString(m));
		
		Field var2 = A.class.getDeclaredField("s");
		System.out.println(var2.getName());//s
		System.out.println(var2.getType());
		System.out.println(var2.get(new A()));
		System.out.println(Modifier.toString(var2.getModifiers()));
	}

}
