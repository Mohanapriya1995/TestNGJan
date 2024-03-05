package com.app.sampletest;

import org.testng.annotations.Test;

public class Parallel_Method {
	
	@Test
	public void test1() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("test1");
	}
	

	@Test
	public void test2() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test2");
	}

	

	@Test
	public void test3() {
	System.out.println(Thread.currentThread().getId());
	System.out.println("test3");
	}
	

	@Test
	public void test4() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test4");
	}

}
