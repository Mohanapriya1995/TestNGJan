package com.app.sampletest;

import org.testng.annotations.Test;

public class Group2 {

	@Test(groups= {"sanity","reg"})
	public void test4() {
		System.out.println("test4");
	}
	

	@Test(groups= {"smoke","reg"})
	public void test5() {
		System.out.println("test5");
	}
	

	@Test (groups= {"sanity","reg"})
	public void test6() {
		System.out.println("test6");
	}
}
