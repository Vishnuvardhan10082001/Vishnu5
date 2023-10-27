package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class psw{
	private WebElement pwd;
	private WebElement usn;
	private WebElement login;
	private WebElement out;
	public psw(WebDriver driver)
	{ 
		this(driver, 10);
		pwd=driver.findElement(By.name("pwd"));
		usn=driver.findElement(By.id("username"));
		login=driver.findElement(By.xpath("//div[.='Login ']"));
	}
		
	public psw(WebDriver driver,int c) {
		out=driver.findElement(By.xpath("//a[@id='logoutLink']"));
	}
    public void setpwd(String a,String b) {
    	usn.sendKeys(a);
    	pwd.sendKeys(b);
    	login.click();
    }
    public void setout() {
    	out.click();
    }
   
}
