package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alllin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public static void text()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> list = driver.findElements(By.ByXPath.xpath("//a"));
		int count = list.size();
		System.out.println(count);
		int i=count-1;
		while(i>0) {
			String text = list.get(i).getText();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println(text);
			i--;
			if (i==0) {
				list.get(i).click();
			}
		}

	}
}

