package demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/CHANDRA%20OBULA%20REDDY/OneDrive/Desktop/java/res.html");
		driver.findElement(By.id("ev"));
		Thread.sleep(4000);
		File f = new File("C:\\Users\\CHANDRA OBULA REDDY\\Downloads\\vishnuvardhan reddyresume.pdf");
		String abp = f.getAbsolutePath();
		driver.findElement(By.id("ev")).sendKeys(abp);
		
		
		

	}

}
