package com.cicd.simple;

/**
 * A simple application class for CI/CD demonstration.
 */
public class App {
    
    /**
     * A simple method to demonstrate functionality.
     * @return a fixed greeting string
     */
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}