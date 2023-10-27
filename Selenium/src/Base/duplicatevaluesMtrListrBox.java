package Base;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class duplicatevaluesMtrListrBox {
static {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void Duplicate() {
	TreeSet t=new TreeSet();
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/CHANDRA%20OBULA%20REDDY/OneDrive/Documents/hotel.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr);
	List<WebElement> opt = s.getOptions();
	int count=opt.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text = opt.get(i).getText();
		if(t.add(text)==false) {
			System.out.println(text);
		}
	} driver.close();
}
}
