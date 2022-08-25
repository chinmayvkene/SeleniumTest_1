package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_ParticularElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		
		WebElement checkbox = driver.findElement(By.xpath("//a[text()='Russel.Hamilton']//parent::td//parent::tr//input"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView()", checkbox);
		Thread.sleep(1000);
		checkbox.click();			
	}
}
