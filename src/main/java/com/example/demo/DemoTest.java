package com.example.demo;

public class DemoTest {
    public static void main(String[] args) {
         // Simulated AWS secret key (realistic format)
        String awsAccessKey = "AKIA1234567890ABCDEF";
        String awsSecretKey = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";

        if (awsSecretKey != null)
            System.out.println("Using secret: " + awsSecretKey); // Missing braces (Checkstyle violation)
            System.out.println("Accessing AWS with key: " + awsAccessKey);
    }
}
