package generic;

public class Demo1 {

	public static void m1(String s,String... elementName)
	{
		System.out.println(s);
		if(elementName.length==0)
		{
			System.out.println("No 2nd arg");
		}
		else
		{
			System.out.println(elementName.length);
			for(String v:elementName)
			{
				System.out.println(v);
			}
		}

	}
	public static void main(String[] args) {
		
		m1("bhanu");
		m1("bhanu","un");
		m1("bhanu","un","pw");
	}

}
