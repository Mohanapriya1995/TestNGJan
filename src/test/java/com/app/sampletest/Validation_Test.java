package com.app.sampletest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Validation_Test {

	// two SoftAssert , HardAssert
/*
	@Test(priority = 1)
	public void test1() {
		System.out.println("Before Hard Assert");
		String s = "Welcome";
		Assert.assertTrue(s.contains("w"));
		System.out.println("Test1");
		// hardAssert
	}*/

	@Test(priority = 2)
	public void test2() {
		System.out.println("pass");
		// SoftAssert
		String s = "Welcome";
		SoftAssert s1 = new SoftAssert();
		s1.assertTrue(s.contains("w"));
	//	s1.assertAll();
		System.out.println("Test1");
	}

}
