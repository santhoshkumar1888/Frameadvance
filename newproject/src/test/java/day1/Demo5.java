package day1;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Demo5 {
	@Parameters({"city"})
	@Test
	public void testq(@Optional("mys") String city) {
		Reporter.log("Testq"+city,true);
	}

}
