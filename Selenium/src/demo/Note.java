package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Note {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public  static void main (String [] args) throws IOException, InterruptedException
	{
		FileInputStream f1 = new FileInputStream("./data/comman.praperty.txt");
		Properties p = new Properties();
		p.load(f1);
		String url = p.getProperty("url");
		String usn = p.getProperty("usn");
		String psw = p.getProperty("psw");
		System.out.println(url);
		System.out.println(usn);
		System.out.println(psw);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(psw);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);		
		
	}

}
