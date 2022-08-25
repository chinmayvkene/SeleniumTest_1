package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='sign_up']")).click();
		boolean check = driver.findElement(By.xpath("//span[text()='Female']//preceding-sibling::input")).isSelected();
		System.out.println(check);
		driver.findElement(By.xpath("//span[text()='Female']//preceding-sibling::input")).click();
		boolean check1 = driver.findElement(By.xpath("//span[text()='Female']//preceding-sibling::input")).isSelected();
		System.out.println(check1);
		driver.close();
	}
}
