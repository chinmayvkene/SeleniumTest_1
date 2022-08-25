package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.findElement(By.xpath("//input[@name='sign_up']")).click();
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		Thread.sleep(1000);
		
		Select selday = new Select(day);
		selday.selectByIndex(5);
		
		Select selmonth = new Select(month);
		selmonth.selectByVisibleText("Aug");
		
		Select selyear = new Select(year);
		selyear.selectByValue("1996");
	}
}
