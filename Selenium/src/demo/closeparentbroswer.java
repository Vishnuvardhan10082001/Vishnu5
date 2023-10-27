package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class closeparentbroswer {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
@Test
public void test() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com/auth?hl=en_US&service=my&co=US&continue=https%3A%2F%2Fwww.indeed.com%2F");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
	driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
	driver.close();
	
	
}
}
