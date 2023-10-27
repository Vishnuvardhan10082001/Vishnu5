package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouse {
	static {
		//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
@Test
	public  void action() throws InterruptedException  {
	
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement rs = driver.findElement(By.partialLinkText("Resources"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(rs).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement log = driver.findElement(By.id("loginspan"));
		a.doubleClick(log).perform();
		String title = driver.getTitle();
		System.out.println(title);
	
		

}
}
