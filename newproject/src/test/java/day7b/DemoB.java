package day7b;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class DemoB{

	@Test
	public void testB()
	{
		Reporter.log("testB",true);
	}
}
