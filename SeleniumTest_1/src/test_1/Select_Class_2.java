package test_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class_2 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//a[@id='menu_time_viewTimeModule']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='menu_attendance_Attendance']")).click();
		//driver.findElement(By.xpath("//a[@id='menu_attendance_viewAttendanceRecord']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Punch In/Out')]")).click();
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath("//*[contains(@class,'ui-datepicker-year')]"));
		Select selyear = new Select((WebElement) year);
		selyear.selectByValue("1996");
		Thread.sleep(1000);
		List<WebElement> month = driver.findElements(By.xpath("//select[contains(@class,'ui-datepicker-month')]//option"));
		for(WebElement mont:month) {
			if(mont.getText().equals("Aug"))
				mont.click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='5']")).click();
		
		
		
		
		/*Select selmonth = new Select((WebElement) month);
		selmonth.selectByValue("Aug");
		
		Select selday = new Select(day);
		selday.selectByValue("5");*/
		
		
	}
}
