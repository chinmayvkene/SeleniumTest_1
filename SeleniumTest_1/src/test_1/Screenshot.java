package test_1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
    static WebDriver driver;
	public void screenShotss(WebDriver driver) throws IOException {
		TakesScreenshot scrnshot = (TakesScreenshot)driver;
		File source = scrnshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\Selenium Screenshot\\ssshot.png");
		FileHandler.copy(source, destination);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		
		Screenshot ss = new Screenshot();
		ss.screenShotss(driver);
		
		Thread.sleep(1000);
		driver.quit();
	}
}
