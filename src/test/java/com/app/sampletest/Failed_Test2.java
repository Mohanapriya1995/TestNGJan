package com.app.sampletest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failed_Test2 {

	@Test
	public void test1() {
		Assert.assertTrue(true);
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		Assert.assertTrue(true);
		System.out.println("Test1");
	}
/*
	@Test(retryAnalyzer=Failed_Test_Retry.class)
	public void test3() {
		Assert.assertTrue(false);
		System.out.println("Test3");
	}*/
	
	@Test
	public void test3() {
		Assert.assertTrue(false);
		System.out.println("Test3");
	}

	@Test
	public void test4() {
		Assert.assertTrue(false);
		System.out.println("Test4");
	}

	@Test
	public void test5() {
		Assert.assertTrue(true);
		System.out.println("Test5");
	}

}
