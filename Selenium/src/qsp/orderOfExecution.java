package qsp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orderOfExecution {

	@Test
	public void case1() {
		System.out.println("case 1");
	}
	@BeforeClass
	public void Bfclass() {
		System.out.println("Before class should be executed");
	}
	@AfterClass
	public void Afclass() {
		System.out.println("After class should be executed");
	}
	@BeforeTest
	public void Bftest() {
		System.out.println("Before test method should be executed");
	}
	@AfterTest
	public void Aftest() {
		System.out.println(" After test should be executed"); 
	}
	@BeforeMethod
	public void Bfmethod() {
		System.out.println("Before method should be executed");
	}
	@AfterMethod
	public void AfMethod() {
		System.out.println("after method should be executed");
	}
	@BeforeGroups
	public void Bfgroup() {
		System.out.println("beforegroups should be executed");
	}
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("Before suite should be executed");
	}
}
