package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();

		driver.navigate().to("https://demo.actitime.com/login.do");;
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//driver.close();
	}

}
