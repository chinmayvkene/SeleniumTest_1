package testNGAssertion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckHardAssertion {

	static WebDriver driver;
	@BeforeClass
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	
	@Test(priority=1)
	public void url() {
		String url = driver.getCurrentUrl();
		SoftAssert sof = new SoftAssert();
		Assert.assertEquals(url,"https://www.flipkart.com/","verify url" );
		System.out.println("next line after hard assert");
		sof.assertAll();
	}
	
	@Test(priority=2)
	public void pagetext() {
		String pagetext = driver.findElement(By.xpath("//span[@class='_36KMOx']")).getText();
		Assert.assertEquals(pagetext, "Login", "verify pagetext");
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
