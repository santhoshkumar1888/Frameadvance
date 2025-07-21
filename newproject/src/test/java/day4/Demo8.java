package day4;

public class Demo8 {
	//handling dynamic number of args - var args
		public static void m1(String... a)
		{
			System.out.println("---start---");
			for(String v:a)
			{
				System.out.println(v);
			}
			System.out.println("---end---");
		}
		public static void main(String[] args) {
			m1();
			m1("Bhanu");
			m1("Bhanu","Ravi");
		}

}
