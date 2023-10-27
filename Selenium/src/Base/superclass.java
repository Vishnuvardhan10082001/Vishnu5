package Base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class superclass {
	
@BeforeClass
public void open() {
	System.out.println("open browser");
}
@BeforeMethod
public void login() {
	System.out.println("login");
}
@AfterMethod
public void logout() {
	System.out.println("logout");
}
@AfterClass
public void close() {
	System.out.println("close browser");
}
	
}

