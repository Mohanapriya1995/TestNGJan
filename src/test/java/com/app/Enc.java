package com.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.crypto.spec.SecretKeySpec;

public class Enc {
	// Main driver method  
    public static void main(String[] args) 
        throws IOException, GeneralSecurityException 
    { 
        Properties properties = new Properties(); 
        FileInputStream fileInputStream 
            = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\new\\Sample_Jan\\src\\test\\resources\\TestData\\config.properties"); 
        properties.load(fileInputStream); 
        String password 
            = properties.getProperty("password"); 
  
        if (password == null) { 
            throw new IllegalArgumentException( 
                "Parameter is not present in configuration file"); 
        } 
  
        byte[] salt = new String("622836429").getBytes(); 
        int iterationCount = 10000; 
        int keyLength = 128; 
        
        secretKey object = new secretKey(); 
        SecretKeySpec key = object.generateSecretKey( 
            password.toCharArray(), salt, iterationCount, 
            keyLength); 
  
/*         String originalPassword = password; 
        System.out.println("Original password: "
                           + originalPassword); 
        String encryptedPassword 
            = object.encrypt(originalPassword, key); */
        
        /*System.out.println("Encrypted password: "
                           + encryptedPassword); */
    } 
}
