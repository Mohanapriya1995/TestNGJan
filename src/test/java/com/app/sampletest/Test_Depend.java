package com.app.sampletest;

import org.testng.annotations.Test;

public class Test_Depend {

	@Test
	public void user() {
		System.out.println("user");
	}
	

	@Test(dependsOnMethods= {"user"})
	public void pass() {
		System.out.println("pass");
	}
	
}
