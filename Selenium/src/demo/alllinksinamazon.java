package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllinksinamazon {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> all = driver.findElements(By.tagName("a"));
		int count=all.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text=all.get(i).getText();
			System.out.println(text);
			if(i==2) {
				all.get(i).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
			}
		}
	//	driver.close();
	}

}
