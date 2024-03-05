package com.app.sampletest;

import org.testng.annotations.Test;

public class Test_Prio {
	
	
	@Test(priority =-1)
	public void user() {
		System.out.println("user");
	}
	

	@Test(priority =0)
	public void pass() {
		System.out.println("pass");
	}
	

	@Test(priority =1)
	public void login() {
		System.out.println("login");
	}

}
