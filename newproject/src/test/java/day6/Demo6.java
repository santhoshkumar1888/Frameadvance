package day6;

//existing class
class B
{
	void m1()
	{
		System.out.println("m1 of B");
	}
	
	
}

//decorator class is C 
class C extends B
{
	@Override
	void m1()
	{
		System.out.println("before method");
		super.m1();
		System.out.println("after method");
	}
}

public class Demo6 {

	public static void script(B b1)
	{
		b1.m1();
	}
	
	public static void main(String[] args) {
		B b1=new C();
		Demo6.script(b1);

	}

}
