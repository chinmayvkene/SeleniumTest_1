package testNGAssertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class New_Parallel {

	WebDriver driver;
	@BeforeTest(groups="launching")
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	
	@Test(priority=1, groups="sanity")
	public void verifyurl() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.flipkart.com/");
	}
	
	@Test(priority=2, groups="sanity")
	public void verifytitle() {
		String title = driver.findElement(By.xpath("//span[@class='_36KMOx']")).getText();
		SoftAssert softy = new SoftAssert();
		softy.assertEquals(title, "Login");
		softy.assertAll();
	}
	
	@Test(priority=3, groups="regression")
	public void topoffersicon() {
		boolean result = driver.findElement(By.xpath("//div[text()='Top Offers']")).isDisplayed();
		Assert.assertEquals(result, true);
	}
	
	@Test(priority=4, groups="regression")
	public void groceryicon() {
		boolean result = driver.findElement(By.xpath("//div[text()='Grocery']")).isDisplayed();
		Assert.assertEquals(result, true);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
