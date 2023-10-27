package demo;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("00000000");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Vishnu1000");
		Thread.sleep(4000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Friends']")).click();

	}

}
