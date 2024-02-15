package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {
	
	@BeforeTest
	private void beforetest() {
		System.out.println("beforetest day4");

	}
	
	@Test
	public void WebLoginCarLoan() {
		System.out.println("weblogincar day4");
	}
	
	@Test
	public void MobileLoginCarLoan() {
		System.out.println("mobilelogincar day4");
	}
	
	@Test
	public void LoginAPICarLoan() {
		System.out.println("loginlogincar day4");
	} 
}
