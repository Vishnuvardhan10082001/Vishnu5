
package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class context {
	static {
		//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}

	public static void main(String[] args) throws InterruptedException, AWTException  {
	
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.actitime.com/login.do");
				Thread.sleep(2000);
				 WebElement target = driver.findElement(By.partialLinkText("actiTIME Inc."));
				 Actions a = new Actions(driver);
				 a.contextClick(target).perform();
				 Thread.sleep(2000);
				 Robot r = new Robot();
				 r.keyPress(KeyEvent.VK_W);
				
}
}