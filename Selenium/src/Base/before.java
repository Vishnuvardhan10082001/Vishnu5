package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class before {

	WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void beforemethod(String browser){
		if(browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get("https://www.google.com/");
		}
	}
	@AfterClass
	public void after() {
		driver.close();
	}
	@Test
	public void block1() {
		System.out.println(" block1 ");
		System.out.println(Thread.currentThread().getId());
	}
}

