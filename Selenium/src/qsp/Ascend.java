package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ascend {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void ascen() {
		ArrayList a=new ArrayList<>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/CHANDRA%20OBULA%20REDDY/OneDrive/Documents/hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		for(int i=0;i<count;i++) {
			String text=options.get(i).getText();
			a.add(text);
			System.out.println("before"+text);
		}
		Collections.sort(a);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}

	}
}
