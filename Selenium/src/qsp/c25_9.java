package qsp;

import java.awt.ActiveEvent;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindActiveElement;

import demo.file;

public class c25_9 {
     static {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     }
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().activeElement().sendKeys(Keys.SHIFT+"admin");
//		Robot rt new Robot();	
//		rt.keyPress(KeyEvent.VK_TAB);
//		driver.close();
	}

}
