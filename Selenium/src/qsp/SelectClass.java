package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(" //a[text()='Create new account']")).click();
		Thread.sleep(4000);
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		Thread.sleep(3000);
		s.selectByIndex(9);
		System.out.println("day");
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		Thread.sleep(3000);
		s1.selectByValue("8");
		System.out.println("month");

		Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		Thread.sleep(2000);
		s2.selectByVisibleText("2001");
	}

}
