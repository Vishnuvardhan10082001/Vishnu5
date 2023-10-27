package Base;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UniqueOptions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	@Test
	public void option(){
		HashSet h=new HashSet();
		TreeSet t=new TreeSet();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/CHANDRA%20OBULA%20REDDY/OneDrive/Documents/hotel.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement option = driver.findElement(By.id("mtr"));
		Select s=new Select(option);
		List<WebElement> opt=s.getOptions();
		int count = opt.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = opt.get(i).getText();
			h.add(text);
			t.add(text);
			System.out.println(text);
		}
		System.out.println("===========");
		for(Object i:h) {
			System.out.println("hashset options"+i);
		}
		for(Object i:t) {
			System.out.println("treeset"+i);
		}
		driver.close();
	}

}
