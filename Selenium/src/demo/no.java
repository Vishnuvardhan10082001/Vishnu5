package demo;

import java.util.PriorityQueue;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.testng.TestRunner.PriorityWeight;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class no {
	static{
		
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

    @Test(invocationCount  = 3)
    public static void text()
    {
    	System.out.println("text is executed");
    }
    @Test(priority = 2)
    public static void create()
    {
    	System.out.println("create");
    }
    @Test(priority = 1)
    public static void hi()
    {
    	System.out.println("hi");
    }
    @BeforeClass
    public  static void open()
    {
    	System.out.println("open");
    }
    @AfterClass
    public static void close()
    {
    	System.out.println("close");
    }
    @BeforeMethod
    public static void login()
    {
    	System.out.println("login");
    }
    @AfterMethod
    public static void logout()
    {
    	System.out.println("logout");
    }

}