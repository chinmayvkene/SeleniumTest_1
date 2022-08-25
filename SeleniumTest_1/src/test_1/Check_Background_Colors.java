package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Background_Colors {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(iframe);
		String rgb = driver.findElement(By.cssSelector("#red div")).getCssValue("background-color");
		System.out.println(rgb);
	}
}
