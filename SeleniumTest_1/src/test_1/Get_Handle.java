package test_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Handle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String winID1 = driver.getWindowHandle();
		System.out.println("Primary ID = "+winID1);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(2000);
		Set<String> allwinID = driver.getWindowHandles();
		for(String ID:allwinID) {
			System.out.println(ID);
		}
		Thread.sleep(2000);
		driver.switchTo().window(winID1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		
	}
}
