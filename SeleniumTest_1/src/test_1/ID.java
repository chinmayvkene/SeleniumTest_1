package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement textToverify = driver.findElement(By.xpath("//*[contains(text(),'Panel')]"));
		String txt = textToverify.getText();
		System.out.println(txt);
		
		WebElement userName = driver.findElement(By.xpath("//input[contains(@name,'Username')]"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@name,'Password')]"));
		password.sendKeys("admin123");
		
		WebElement btnlogin = driver.findElement(By.xpath("//input[@name='Submit']"));
		btnlogin.click();
		Thread.sleep(2000);
		driver.quit();
	}
}
