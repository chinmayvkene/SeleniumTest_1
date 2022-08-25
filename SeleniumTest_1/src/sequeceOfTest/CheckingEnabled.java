package sequeceOfTest;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckingEnabled {

	@Test(priority=1)
	public void login() {
		Reporter.log("login sucessfully", true);
	}
	
	@Test(priority=2, enabled=false)
	public void home() {
		Reporter.log("home page", true);
	}
	
	@Test(priority=3)
	public void feed() {
		Reporter.log("feed page", true);
	}
}
