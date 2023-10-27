package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class document {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.out.println("hi");
		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		Thread.sleep(5000);
		j.executeScript("document.getElementById('username').value='admin' ");
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("manager");
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
         driver.switchTo().activeElement().click();
         Thread.sleep(5000);
		
		
		
  
	}

}
