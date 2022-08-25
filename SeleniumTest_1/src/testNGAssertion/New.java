package testNGAssertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(listneruti.Listenerr1.class)
public class New {

	@Test(priority=1)
	public void login() {
		System.out.println("Login Sucessfully");
		SoftAssert softy = new SoftAssert();
		softy.assertEquals(true, true);
		System.out.println("Soft Assert");
		softy.assertAll();
	}
	
	@Test(priority=2,enabled=true)
	@Parameters({"browser","version"})
	public void home(String checkingbrowser, String checkingversion) {
		if(checkingbrowser.equals("chrome")) {			Reporter.log("chrome is running",true);
			Reporter.log("running version is "+checkingversion,true);
		}
		else if(checkingbrowser.equals("firefox"))
			Reporter.log("firefox is running",true);
	}
	
	@Test(priority=3,  dependsOnMethods="login")
	public void feed() {
		System.out.println("feed page");
	}
	
	@Test(priority=4)
	public void logout() {
		System.out.println("Logout Sucessfully");
	}
}
