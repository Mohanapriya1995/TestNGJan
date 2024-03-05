package com.app.prog;

import java.util.HashMap;
import java.util.Map;

public class Sample {

	public static void test1() {
		int a[] = { 1, 4, 2, 5, 3 };
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

	public static void array_sort() {
		int a[] = { 1, 4, 2, 5, 3 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void array_sort_string() {
		String a[] = { "Size", "Sort", "Curd" };
		String temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
// HashMap 
	public static void string_word_count() {
		String s = "Welcome to Java Java";
		String[] split = s.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < split.length; i++) {
			if(map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count+1);
			}else {
				map.put(split[i], 1);
			}
		}
		
	System.out.println(map);	
	}
	
	
	public static void string_num() {
		String s = "1a2b3c$%^";
		String replaceAll = s.replaceAll("[a-z]", "");
		String charc = s.replaceAll("[0-9]", "");
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			/*if(Character.isDigit(c)) {
				System.out.println(c);
			}*/
			if(!Character.isAlphabetic(c)&& !Character.isDigit(c)) {
				System.out.println(c);
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		string_num();
	}
}
