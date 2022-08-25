package test_1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Child_Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		
		String winid1 = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		String winid2 = driver.getWindowHandle();
		Thread.sleep(1000);
		if(winid1==winid2) {
			driver.findElement(By.xpath("//input[@id='login_email1']")).sendKeys("Chinmay");
		}
		else if(!(winid1==winid2)) {
			String winid3 = driver.getWindowHandle();
			driver.switchTo().window(winid3);
			driver.findElement(By.xpath("//input[@id='login_email1']")).sendKeys("Chinmay");	
		}
		
	}
}