package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class faceboo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		Thread.sleep(5000);
		String titl=driver.getTitle();
		System.out.println(titl);
	// driver.findElement(By.name("q")).sendKeys("vishnu");
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.titleContains("BBC - Homepage"));
		List<WebElement> auto = driver.findElements(By.xpath("(//div[@class='top-list'])[1]"));
		System.out.println(auto);
		Thread.sleep(5000);
		for(int i=0;i<auto.size();i++) {
			String text=auto.get(i).getText();
			System.out.println(text);
		}
         auto.get(auto.size()-1).click();
		
	}

}

