package com.app.test;

import org.junit.Assert;
import org.junit.Test;

public class SampleOne {

	@Test
	public void test1() {
		// Validation ->Assert class
		String s = "Aiite";
		Assert.assertEquals("aiite", s);// condition true
		System.out.println("Validation success");
	}

	@Test
	public void test2() {
		// Validation ->Assert class
		String s = "Aiite";
		Assert.assertTrue(s.contains("A"));
		System.out.println("Validation success");
		System.out.println("test2");

	}

	@Test
	public void test3() {
		// Validation ->Assert class
		String s = "Aiite";
		Assert.assertFalse(s.contains("a"));
		System.out.println("Validation success");
		System.out.println("test3");
	}

}
