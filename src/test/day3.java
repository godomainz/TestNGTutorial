package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	private void BeforeClass() {
		System.out.println("BeforeClass day3");

	}
	
	@AfterClass
	private void AfterClass() {
		System.out.println("AfterClass day3");

	}
	
	@BeforeTest
	private void beforetest() {
		System.out.println("beforetest day3");

	}
	
	@Test
	public void WebLoginCarLoan() {
		System.out.println("WebLoginCarLoan day3");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCarLoan day3");
	}
	
	@Test
	public void MobileLoginCarLoan1() {
		System.out.println("MobileLoginCarLoan1 day3");
	}
	
	@Test
	public void MobileLoginCarLoan2() {
		System.out.println("MobileLoginCarLoan2 day3");
	}
	
	
	@Test
	public void LoginAPICarLoan() {
		System.out.println("LoginAPICarLoan day3");
	}
	
	@Test(dependsOnMethods = {"WebLoginCarLoan"})
	public void APICarLoan() {
		System.out.println("APICarLoan day3");
	}
	@AfterTest
	private void LastTest() {
		System.out.println("LastTest day3");

	}
}
