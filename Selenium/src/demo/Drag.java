package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
@Test
	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Actions a = new Actions(driver);
		
		WebElement block1 = driver.findElement(By.xpath("(//h1[@class='draghandle'])[1]"));
		Thread.sleep(2000);
		          WebElement block4 = driver.findElement(By.xpath("(//h1[@class='draghandle'])[4]"));
		      	Thread.sleep(2000);
		          a.dragAndDrop(block1, block4).perform();

	}

}
