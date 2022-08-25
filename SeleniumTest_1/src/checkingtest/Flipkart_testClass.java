package checkingtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class Flipkart_testClass {

	WebDriver driver;
	
	
	@BeforeSuite
	public void browserconfig() throws IOException {
		Reporter.log("browser setting", true);
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void browserwindowset() {
		Reporter.log("browser window setting", true);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void openapplication() throws IOException {
		Reporter.log("open application", true);
		FileInputStream load = new FileInputStream("G:\\Eclipse Projects\\SeleniumTest_1\\config.properties");
		Properties prop = new Properties();
		prop.load(load);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	@BeforeMethod
	public void login() throws IOException {
		driver.manage().timeouts().getPageLoadTimeout();
		FileInputStream load = new FileInputStream("G:\\Eclipse Projects\\SeleniumTest_1\\config.properties");
		Properties prop = new Properties();
		prop.load(load);
		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test
	public void testcase1() {
		Reporter.log("Test Case 1 executing for user verification", true);
	}
	
	@AfterMethod
	public void logout(){
		Reporter.log("user logout sucessfully", true);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
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
		driver.close();
	}
	
	@AfterSuite
	public void browserchange() {
		Reporter.log("browser changing", true);
	}
}
