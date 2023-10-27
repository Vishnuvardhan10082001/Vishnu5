package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tt {
	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/CHANDRA%20OBULA%20REDDY/OneDrive/Desktop/java/page1.html");
		driver.findElement(By.id("t1")).sendKeys("A");
		driver.switchTo().frame("f1/");
		driver.findElement(By.id("t2")).sendKeys("B");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("C");
		driver.switchTo().frame("f1/");
		driver.findElement(By.id("t2")).sendKeys("D");
		
		
		
	}

}
