package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginWithOutLocator {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void Login() {
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");;
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.querySelector(\"#username\").value='admin'");
	js.executeScript("document.querySelector(\"#loginFormContainer > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(2) > td > input\").value='manager'");
	 js.executeScript("document.querySelector(\"#loginButton > div\").");

}
}
