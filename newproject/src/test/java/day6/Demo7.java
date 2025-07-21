package day6;

//given by Selenium
class App
{
	void open()
	{
		System.out.println("open the app");
	}
	
	void login()
	{
		System.out.println("login to app");
	}
	
	void close()
	{
		System.out.println("close the app");
	}
}
//by Bhanu
class Decorator extends App
{
	MyLib m;
	Decorator(MyLib m)
	{
		this.m=m;
	}
	@Override
	void open()
	{
		m.before();
		super.open();
		m.after();
	}
	@Override
	void login()
	{
		m.before();
		super.login();
		m.after();
	}
	@Override
	void close()
	{
		m.before();
		super.close();
		m.after();
	}
}
//by Bhanu
interface MyLib 
{
	void before();
	void after();
}

class Student implements MyLib
{

	public void before() {
		System.out.println("Before method");
		
	}

	public void after() {
		System.out.println("After method");
		
	}


}
public class Demo7 {
	public static void script1(App a)
	{
		a.open();
		a.login();
		a.close();
	}
	public static void main(String[] args) {
		App a1=new Decorator(new Student());
		Demo7.script1(a1);

	}

}