package checkingtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_annotations {

	@BeforeSuite
	public void browserconfigure() {
		Reporter.log("browser setting", true);
	}
	
	@BeforeTest
	public void browserwindowsetting() {
		Reporter.log("code for maximizing", true);
	}
	
	@BeforeClass
	public void openapplication() {
		Reporter.log("Opening an application", true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("user login sucessfully", true);
	}
	
	@Test
	public void testcase1() {
		Reporter.log("Test Case 1 executing for user verification", true);
	}
	
	@AfterMethod
	public void logout(){
		Reporter.log("user logout sucessfully", true);
	}
	
	@Test
	public void testcase2() {
		Reporter.log("Test case 2 executing for grosaries", true);
	}
	
	@AfterClass
	public void closeaplication() {
		Reporter.log("Closing application", true);
	}
	
	@AfterTest
	public void closingbrowser() {
		Reporter.log("Closing browser", true);
	}
	
	@AfterSuite
	public void browserchange() {
		Reporter.log("browser changing", true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
