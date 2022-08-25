package test_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DOB_1 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.cssSelector("._97w5")).click();
		
		List<WebElement> daylist = driver.findElements(By.cssSelector("#day option"));
		for(WebElement day:daylist) {
			if(day.getText().equals("5"))
				day.click();
		}
		
		List<WebElement> monthlist = driver.findElements(By.cssSelector("#month option"));
		for(WebElement month:monthlist) {
			if(month.getText().equals("Aug"))
				month.click();
		}
		
		List<WebElement> yearlist = driver.findElements(By.cssSelector("#year option"));
		for(WebElement year:yearlist) {
			if(year.getText().equals("1996"))
				year.click();
		}
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(1000);
		driver.close();
	}
}
