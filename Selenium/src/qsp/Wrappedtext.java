package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrappedtext {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/CHANDRA%20OBULA%20REDDY/OneDrive/Documents/hotel.html");
		WebElement text = driver.findElement(By.id("mtr"));
		Select s2=new Select(text);
		WebElement opt = s2.getWrappedElement();
		System.out.println(s2.isMultiple());
		System.out.println(opt.getText()); driver.close();
	
	}

}
