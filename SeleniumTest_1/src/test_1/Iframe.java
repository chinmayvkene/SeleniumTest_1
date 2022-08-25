package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.cssSelector("#frame1"));
		driver.switchTo().frame(iframe);
		boolean checktext = driver.findElement(By.cssSelector("#sampleHeading")).getText().equals("This is a sample page");
		System.out.println(checktext);
	}
}
