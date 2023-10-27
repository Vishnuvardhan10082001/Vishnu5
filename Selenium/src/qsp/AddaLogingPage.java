package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddaLogingPage {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void logIn() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://adda.io/myadda/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement emailTbx = driver.findElement(By.id("email"));
		emailTbx.sendKeys("kadirivardhan@gmail.com");
		WebElement passwordTbx = driver.findElement(By.id("password"));
		passwordTbx.sendKeys("Vishnu@010");
		WebElement ak = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border' and @role='presentation' ]"));
		ak.click();
		WebElement signBton = driver.findElement(By.id("submit_login"));
		signBton.click();

	}

}
