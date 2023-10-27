package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contain_text {
 static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
 }
 @Test
 public void create() {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://search.yahoo.com/search?fr=mcafee&type=E211US714G0&p=google");
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	List<WebElement> all = driver.findElements(By.xpath("//b[contains(text(),'java')]"));
	 int count = all.size();
	 System.out.println(count);
 }
}
