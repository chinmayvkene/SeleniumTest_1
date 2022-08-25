package sequeceOfTest;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckingInvocationCount {

	@Test(priority=0, invocationCount =10)
	public void Login() {
		Reporter.log("login sucessfully", true);
	}
	
	@Test(invocationCount=6)
	public void home() {
		Reporter.log("home page", true);
	}
}
