package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class baseclass {
	public static WebDriver driver;
	public static  FileInputStream fis;
	public  static Properties p;

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	@BeforeClass
	public static void open() throws IOException
	{
		driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public static void login() throws IOException {
		fis =new FileInputStream("./data/comman.praperty.txt");
		p=new Properties();
		p.load(fis);
		 String url = p.getProperty("url");
		 String usn = p.getProperty("usn");
			 String psw = p.getProperty("psw");
		driver.get(url);
		driver.manage().window().maximize();
	
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(psw);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public static void logout()
	{
		driver.findElement(By.className("logout")).click();
	}
	@AfterClass
	public static void close()
	{
		driver.close();
	}
}