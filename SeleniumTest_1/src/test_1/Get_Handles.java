package test_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Handles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String winID = driver.getWindowHandle();
		System.out.println(winID);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(2000);
		Set<String> winIDs = driver.getWindowHandles();
		for(String eachwinID:winIDs) {
			driver.switchTo().window(eachwinID);
			if(driver.getTitle().contains("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS")) {
				System.out.println(eachwinID);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Contact Sales']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='FullName']")).sendKeys("Chinmay");
			Thread.sleep(1000);
			}
		}
		driver.switchTo().window(winID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Chinmay");
		
		
	}
}
