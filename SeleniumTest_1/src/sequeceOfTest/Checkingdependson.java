package sequeceOfTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Checkingdependson {

	@Test(priority=1)
	public void login() {
		Reporter.log("login sucessfully", true);
		SoftAssert sof = new SoftAssert();
		AssertJUnit.assertEquals(false, true);
		sof.assertAll();
	}
	
	@Test(priority=2)
	public void home() {
		Reporter.log("home page", true);
	}
	
	@Test(priority=3, dependsOnMethods="login")
	public void feed() {
		Reporter.log("feed page", true);
	}
}
