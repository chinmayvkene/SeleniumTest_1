package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.findElement(By.xpath("//input[@name='sign_up']")).click();
		
		boolean check = driver.findElement(By.xpath("//*[text()='Female']")).isDisplayed();
		System.out.println(check);
	}
}
