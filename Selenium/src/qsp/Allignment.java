package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.microsoft.schemas.office.office.TitleAttribute;

public class Allignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
@Test
public void text() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	WebDriverWait wait=new WebDriverWait(driver, 10);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 WebElement x = driver.findElement(By.id("username"));
	 WebElement y = driver.findElement(By.name("pwd"));
	int n= x.getRect().getX();
	int m=y.getRect().getX();
	int a=x.getRect().getHeight();
	int b=y.getSize().getHeight();
	System.out.println(n+"=========="+m+" =========="+a+"     "+b);
}
}
