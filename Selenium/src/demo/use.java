package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class use {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en_IN&co=IN&continue=https%3A%2F%2Fin.indeed.com%2F%3Fr%3Dus&tmpl=desktop&service=my&from=gnav-util-homepage&jsContinue=https%3A%2F%2Fin.indeed.com%2F&empContinue=https%3A%2F%2Faccount.indeed.com%2Fmyaccess&_ga=2.213873939.621631239.1681968336-1716798793.1681968336");
       String p = driver.getWindowHandle();
       System.out.println(p);
       driver.findElement(By.id("apple-signin-button")).click();
       String a2 = driver.getWindowHandle();
       driver.findElement(By.id("login-facebook-button")).click();
        String a3 = driver.getWindowHandle();
       System.out.println(a3);
       System.out.println(a2);
      Set<String> all = driver.getWindowHandles();
      System.out.println(all);
      for(String wh:all)
      {
    	  driver.switchTo().window(wh);
    	  Thread.sleep(2000);
    	  driver.close();
      }

	}
}