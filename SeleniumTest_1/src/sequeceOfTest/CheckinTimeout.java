package sequeceOfTest;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckinTimeout {

	@Test(timeOut=2000)
	public void m1()  {
		Reporter.log("Running test case 1", true);
	}
	
	@Test
	public void m2() {
		Reporter.log("Running test case 2", true);
	}
}
