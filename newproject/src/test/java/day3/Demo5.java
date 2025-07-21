package day3;

class E
{
	
}
public class Demo5 {

	public static void main(String[] args) throws Exception {
		//i want to store the class itself
		Class v=day3.E.class;
		System.out.println(v);
		
		//convert String into java code
		//class name is present in String format- we can convert it into actual java code
		String className="day3.E";
		Class v2=Class.forName("day3.E");
		System.out.println(v2);
	}

}