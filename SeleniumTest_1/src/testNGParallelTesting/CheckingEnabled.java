package testNGParallelTesting;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(listneruti.Listenrr.class)
public class CheckingEnabled {

	@Test(priority=1)
	public void login() {
		System.out.println("method login");
	}
	
	@Test(priority=-1, enabled=true)
	@Parameters({"browser", "version"})
	public void home(String checkbrowser, String checkversion) {
		if(checkbrowser.equals("chrome")) {
			Reporter.log("chrome is running", true);
			Reporter.log("running version is "+checkversion, true);
		}
		else if(checkbrowser.equals("firefox"))
			Reporter.log("firefox is running", true);
	}
	
	@Test(priority=3)
	public void feed() {
		System.out.println("method feedpage");
	}
}
