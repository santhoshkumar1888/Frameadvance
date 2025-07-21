package day2;

import org.testng.annotations.Factory;

public class Mysuite {
	@Factory
	public Object[] createsuite() {
		Object[] alltests= {new Demo1(),new Demo2(),new Demo3()};
		return alltests;
	}

}
