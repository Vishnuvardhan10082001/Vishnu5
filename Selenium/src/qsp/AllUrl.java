package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demo.list;

public class AllUrl {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void urls () throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int count = link.size();
		System.out.println(count);
		Thread.sleep(3000);
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(1);
		Collections.sort(a);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		for(int i=0;i<count;i++) {
			String text=link.get(i).getText();
			//System.out.println(text);
			
		}

	}
}
