package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drop {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		 WebElement b1 = driver.findElement(By.xpath("(//h1)[2]"));
		 Thread.sleep(1000);
		 WebElement b2 = driver.findElement(By.xpath("(//h1)[4]"));
		 Thread.sleep(2000);
		 Actions a= new Actions(driver);
		 Thread.sleep(3000);
		 a.dragAndDrop(b1,b2).perform();
		// a.dragAndDrop(b2, b1).perform();

}       
}