package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeTest
	private void beforetest() {
		System.out.println("beforetest day3");

	}
	
	@Test
	public void WebLoginCarLoan() {
		System.out.println("weblogincar day3");
	}
	
	@Test
	public void MobileLoginCarLoan() {
		System.out.println("mobilelogincar day3");
	}
	
	@Test
	public void MobileLoginCarLoan1() {
		System.out.println("mobilelogincar day3");
	}
	
	@Test
	public void MobileLoginCarLoan2() {
		System.out.println("mobilelogincar day3");
	}
	
	
	@Test
	public void LoginAPICarLoan() {
		System.out.println("loginlogincar day3");
	}
	
	@AfterTest
	private void LastTest() {
		System.out.println("LastTest day3");

	}
}
