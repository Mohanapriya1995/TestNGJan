package com.app.test;

public class Parallel_Exe {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.test1();
		b.start();

	}

}

class A {

	public void test1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test1");

	}

}

class B extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test2");

	}
}