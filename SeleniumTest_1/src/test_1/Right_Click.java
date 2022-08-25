package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement rightclick = driver.findElement(By.xpath("//*[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Quit']")).click();
		
		driver.switchTo().alert().accept();
		
	 	WebElement doubleclick = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
	 	act.doubleClick(doubleclick).perform();
	 	Thread.sleep(1000);
	 	driver.switchTo().alert().accept();
	}
}
