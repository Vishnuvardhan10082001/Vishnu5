package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hotel {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		HashSet t=new HashSet();
		driver.get("file:///C:/Users/CHANDRA%20OBULA%20REDDY/OneDrive/Documents/hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> text = s.getOptions();
		int count=text.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			s.selectByIndex(i);
			String opt=text.get(i).getText();
			if(t.add(opt)==false) {
			System.out.println(opt);
			}
		} for(int i=0;i<count;i++) {
			s.deselectByIndex(i);
		}
	}
}
