package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimebyusingjavascript {
			static {
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            JavascriptExecutor j=(JavascriptExecutor) driver;
            j.executeScript("document.querySelector(\"#username\").value='admin'");
            j.executeScript("document.querySelector(\"#loginFormContainer > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(2) > td > input\").value='manager'");
            j.executeScript("document.querySelector(\"#loginButton > div\").click()");
	}

}
