package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames_tag {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void frames() {
	WebDriver driver=new ChromeDriver();
	
}
}
