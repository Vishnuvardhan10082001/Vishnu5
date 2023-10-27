package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class set {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		System.out.println("hi");
		WebElement day = driver.findElement(By.id("day"));
		System.out.println("bye");
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(day);
		s.selectByIndex(10);
		WebElement month=driver.findElement(By.id("month"));
		org.openqa.selenium.support.ui.Select s2=new org.openqa.selenium.support.ui.Select(month);
		s2.selectByVisibleText("Aug");
		WebElement year=driver.findElement(By.id("year"));
		org.openqa.selenium.support.ui.Select s3=new org.openqa.selenium.support.ui.Select(year);
		s3.selectByValue("2001");
		System.out.println("year");
		driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
		System.out.println("radio");
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		driver.get("https://www.youtube.com/");

	}

}
