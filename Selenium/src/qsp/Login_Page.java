package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;

public class Login_Page
{

	WebDriver driver;
	public Login_Page(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	     this.driver=driver;
	}
	
	@FindBy(id="username")
    private WebElement textFieldUserName;
    @FindBy(name="pwd")
    private WebElement tfPassword;
    @FindBy(id="loginButton")
    private WebElement btnLogin;
    @FindBy (id="logoutLink")
    private WebElement logot;
}
