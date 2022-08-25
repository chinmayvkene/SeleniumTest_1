package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.findElement(By.xpath("//input[@name='sign_up']")).click();
		
		boolean check = driver.findElement(By.xpath("//*[text()='Female']//parent::label//input")).isEnabled();
		System.out.println(check);
		driver.findElement(By.xpath("//*[text()='Female']//parent::label//input")).click();
		boolean check1 = driver.findElement(By.xpath("//*[text()='Female']//parent::label//input")).isEnabled();
		System.out.println(check1);
	}
}
