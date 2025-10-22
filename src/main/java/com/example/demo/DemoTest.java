package com.example.demo;

public class DemoTest {
    public static void main(String[] args) {
        // Simulated real secret
        String awsSecretKey = "AKIA1234567890ABCD1234";
        if (awsSecretKey != null)
            System.out.println("Using secret: " + awsSecretKey); // Missing braces (Checkstyle violation)
    }
}
