package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short {
    static {
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=zuLTbi-EiEE");
    TakesScreenshot ts=(TakesScreenshot) driver;
   File res = ts.getScreenshotAs(OutputType.FILE);
    File dest=new File("./screenshort/vishnuvar.png");
    FileUtils.copyFile(res, dest);
	}

}
