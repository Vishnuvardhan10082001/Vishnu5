package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver()
		driver.get("https://www.bbc.com/");
		//driver.findElement(By.name("q")).sendKeys("bbc.homepage");
		Thread.sleep(3000);
		List<WebElement> s = driver.findElements(By.xpath("(//div[@class='top-list'])[1]"));
		int count=s.size();
		System.out.println(count);
        for(int i=0;i<count;i++) {
        	String a=s.get(i).getText();
        	System.out.println(a);
			
		}  s.get(count-1).click();
	}

}
