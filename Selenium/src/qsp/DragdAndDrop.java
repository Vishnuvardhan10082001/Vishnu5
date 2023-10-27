package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragdAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public static void Drag() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		String text1 = source.getText();
		System.out.println(text1);
		Thread.sleep(3000);
		WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Thread.sleep(3000);
		String text2 = dest.getText();
		System.out.println(text2);
		a.dragAndDrop(source, dest);

	}
}
