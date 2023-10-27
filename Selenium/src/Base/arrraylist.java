package Base;



import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;	
		
public class arrraylist{
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
 @Test
	public void main() throws InterruptedException {
	 HashSet hs=new HashSet();
	 
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/CHANDRA%20OBULA%20REDDY/OneDrive/Documents/hotel.html");
	Thread.sleep(5000);
	WebElement opt = driver.findElement(By.id("mtr"));
	Select s1=new Select(opt);
	 List<WebElement> allopt = s1.getOptions(); 
	 int count=allopt.size();
	System.out.println(allopt);
	for(int i=0;i<count;i++) {
		String text=allopt.get(i).getText();
		boolean fal = hs.add(text);
		if(fal==false) {
		System.out.println("duplicate   "+text);}
	}
	System.out.println(hs);
	driver.close();






	}

}
