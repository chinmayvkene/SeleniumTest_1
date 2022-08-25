package checkingtest;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckSequence {

	@Test(priority=-1)
	public void testCase1() {
		System.out.println("1st running");
	}
	
	@Test(priority=2)
	public void atestCase2() {
		System.out.println("2nd running");
	}
	
	@Test(priority=3)
	public void testCase3() {
		Reporter.log("Checking Report", false);
	}
	
}
