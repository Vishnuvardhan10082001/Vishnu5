package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Stall {
	WebDriver driver;
	@FindBy(id="username")
	private WebElement usentxf;
	@FindBy(name="pwd")
	private WebElement pwd;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement log;
	@FindBy(id="logoutLink")
	private WebElement logout;
	
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	
	public Stall(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void setLogin() {
		
		usentxf.sendKeys("admin");
		pwd.sendKeys("manager");
		log.click();
		
	}
	@Test
	public void main() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Stall s=new Stall(driver);
		PageFactory.initElements(driver, this);
		s.setLogin();
	}

}
