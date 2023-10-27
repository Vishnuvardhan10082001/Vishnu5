package qsp;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Result;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src  =ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshort/whatsapp.png");
		FileUtils.copyFile(src, dest);
	}

}
