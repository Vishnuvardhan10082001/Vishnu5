package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookCreate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
       driver.findElement(By.linkText("Create new account")).click();
       Thread.sleep(8000);
       WebElement day = driver.findElement(By.id("day"));
      // day.click();
       Thread.sleep(2000);
       Select s=new Select(day);
       s.selectByIndex(9);
       Thread.sleep(2000);
       WebElement month = driver.findElement(By.id("month"));
       Select s1=new Select(month);
       s1.selectByVisibleText("Aug");
       Thread.sleep(2000);
      WebElement year = driver.findElement(By.id("year"));
      Select s2=new Select(year);
      s2.selectByValue("2001");
       
       
	}

}
