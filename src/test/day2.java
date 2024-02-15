package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@BeforeTest
	private void beforetest() {
		System.out.println("beforetest day2");

	}
	
	@Test(groups={"Smoke"})
	public void name() {
		System.out.println("Hi hi day2");
	}

}
