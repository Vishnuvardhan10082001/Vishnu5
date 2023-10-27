package Base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class containstext {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void containtext() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("java");
		Thread.sleep(5000);
		List<WebElement> all = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=all.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			System.out.println((all.get(i).getText()));
		}
		driver.close();
	}

}
