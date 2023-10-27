package qsp;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Anotations {

	@Test(invocationCount = 2)
	public void testOne() {
		System.out.println("testOne shoulde be executed");
	}
	@Test
	public void testtwo() {
		SoftAssert sa=new SoftAssert();
		System.out.println("testTwo will be executed");
		//assert.fail();
	}
	@Test(enabled = false)
	public void testThree() {
		System.out.println("testThree will be executed");
		Reporter.log("i am the king");
	}
}
