package com.app.sampletest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failed_Test1 {
	
	@Test
	public void test1() {
		Assert.assertTrue(false);
		System.out.println("Test1");
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(false);
		System.out.println("Test3");
	}
	

	@Test
	public void test2() {
		Assert.assertTrue(true);
		System.out.println("Test1");
	}

}
