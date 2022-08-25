package testNGAssertion;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckAssert_Groups {

	WebDriver driver;
	@BeforeTest(groups="launching")
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	
	@Test(priority=1, groups = "sanity")
	public void verifyurl() {
		String url = driver.getCurrentUrl();
		SoftAssert softy = new SoftAssert();
		AssertJUnit.assertEquals(url, "https://www.flipkart.com/");
		System.out.println("next line after assert");
		softy.assertAll();
	}
	
	@Test(priority=2, groups = "sanity")
	public void verifypagetext() {
		String pagetext = driver.findElement(By.xpath("//span[@class='_36KMOx']")).getText();
		AssertJUnit.assertEquals(pagetext,"Login");
		System.out.println("next line after ");
	}
	
	@Test(priority=3, groups = "regression")
	public void verifytopiconTopOffers() {
		boolean result = driver.findElement(By.xpath("//div[text()='Top Offers']")).isDisplayed();
		AssertJUnit.assertEquals(result, true);
	}
	
	@Test(priority=4, groups = "regression")
	public void verifytopiconGrocery() {
		boolean result = driver.findElement(By.xpath("//div[text()='Grocery']")).isDisplayed();
		AssertJUnit.assertEquals(result, true);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
