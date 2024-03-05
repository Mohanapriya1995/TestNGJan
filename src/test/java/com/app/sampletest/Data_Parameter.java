package com.app.sampletest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Data_Parameter {
	
	@Parameters({"username"})
	@Test(priority=1)
	public void test1(String user) {
		System.out.println(user);
		
	}
	


	@Parameters({"password"})
	@Test(priority=2)
	public void test2(String pass) {
		System.out.println(pass);
	}
	

}
