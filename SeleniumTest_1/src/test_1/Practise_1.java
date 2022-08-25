package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("div #txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("div #txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		driver.findElements(By.xpath("//td[text()='Goutam Ganesh']//preceding-sibling::td//input")).get(0).click();
	}
}
//td[text()='Goutam Ganesh']//preceding-sibling::td//input