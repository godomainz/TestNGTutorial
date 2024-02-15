package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@BeforeTest
	private void beforetest() {
		System.out.println("beforetest day1");

	}
	
	@BeforeMethod
	private void BeforeeachMethod() {
		System.out.println("BeforeeachMethod day1");

	}
	
	@Test(enabled = false)
	private void FirstTest() {
		System.out.println("Hello day1");

	}
	
	@Test(timeOut = 4000)
	private void SecondTest() {
		System.out.println("Bye day1");

	}
	
	@AfterTest
	private void LastTest() {
		System.out.println("LastTest day1");

	}
}
