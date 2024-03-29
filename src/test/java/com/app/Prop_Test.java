package com.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Prop_Test {

	public static void prop_read() {

		try {
			FileReader read = new FileReader("C:\\Users\\HP\\eclipse-workspace\\new"
					+ "\\Sample_Jan\\src\\test\\resources\\TestData\\config.properties");
			Properties prop = new Properties();
			prop.load(read);
			String user = prop.getProperty("username");
			System.out.println(user);
			String pass = prop.getProperty("password");
			System.out.println(pass);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String prop_reuse(String data) {
		String value = null;

		try {
			FileReader read = new FileReader("C:\\Users\\HP\\eclipse-workspace\\new"
					+ "\\Sample_Jan\\src\\test\\resources\\TestData\\config.properties");
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);
			System.out.println(value);
		

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	public static void main(String[] args) {
		//prop_read();
		prop_reuse("username");
	}
}
