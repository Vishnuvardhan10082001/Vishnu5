package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTr {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/CHANDRA%20OBULA%20REDDY/OneDrive/Documents/Vishnu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 WebElement mtr = driver.findElement(By.id("mtr"));
		 Dimension count=mtr.getSize();
		Select s=new Select(mtr);
		int a=6;
		for(int i=0;i<a;i++) {
			s.selectByIndex(i);
		}
       
	}

}
