package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']")).click();
		driver.findElement(By.xpath("//*[text()='Desktop']//preceding-sibling::span//*[@class='rct-icon rct-icon-uncheck']")).click();
		
	}
}
