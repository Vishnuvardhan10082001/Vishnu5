package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class list {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test
public  void listbox() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/CHANDRA%20OBULA%20REDDY/OneDrive/Documents/hotel.html");
	 WebElement list = driver.findElement(By.id("cp"));
	Select s = new Select(list);
	Thread.sleep(2000);
	List<WebElement> all = s.getOptions();
	int count = all.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		Thread.sleep(2000);
		s.selectByIndex(i);
		Thread.sleep(2000);
	}
	for (int i=0;i<count;i++)
	{
		s.deselectByIndex(i);
		Thread.sleep(2000);
	}
	//s.deselectAll();
	driver.close();
		

	
}
}
