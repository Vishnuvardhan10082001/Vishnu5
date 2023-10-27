package demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javak {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
	   WebDriver driver=new ChromeDriver();
	   try {
		driver.get("https://yourstory.com/companies");
		   driver.manage().window().maximize();
		   Thread.sleep(7000);
		  driver.findElement(By.xpath("//div[@data-clickurl='Login']")).click();
		  Thread.sleep(7000);
		  driver.switchTo().frame(2);
		 //driver.findElement(By.id("piano-id-Lwtas"))
		 // driver.switchTo().activeElement().sendKeys("vishnuvardhan");
		     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("temp");
		     Thread.sleep(7000);
		    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("2568766");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   finally {
//		   driver.close();
	   }
		}

	}



