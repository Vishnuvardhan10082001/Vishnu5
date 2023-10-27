package qsp;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.concurrent.PriorityBlockingQueue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	@Test(priority  = 2)
	public void test1() {
		System.out.println("test 1 should be executed");
	}
	@Test(invocationCount = 2)
	public void test2() {
		System.out.println("test 2 should");
	}
	@Test()
	public void test3() {
		
		String a="vishnu";
		String b="";
		 Assert.assertSame(b,a);
		 System.out.println("yes both equal");
		
	}

}
