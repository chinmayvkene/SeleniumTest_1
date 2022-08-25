package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']")).click();
		driver.findElement(By.xpath("//span[text()='Desktop']//parent::label//span//*[@class='rct-icon rct-icon-uncheck']")).click();
		String op = driver.findElement(By.xpath("//span[text()='Desktop']//parent::label//span//*[@class='rct-icon rct-icon-check']")).getAttribute("class");
		if(op.contains("check"))
			System.out.println("Checkbox is selected");
		else
			System.out.println("Checkbox is not selected");
	}
}
