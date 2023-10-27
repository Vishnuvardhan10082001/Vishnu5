package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshort {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void screensho() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=WZfh6v53leA");
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshort/vishnu kss.png");
		FileUtils.copyFile(src,dest);
		driver.close();
		
	

}
}