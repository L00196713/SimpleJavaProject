package com.cicd.simple;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * A simple application class for CI/CD demonstration.
 */
public class App {
    
    private static final Logger logger = LogManager.getLogger(App.class);

    /**
     * A simple method to demonstrate functionality.
     * @return a fixed greeting string
     */
    public String getGreeting() {
        logger.info("getGreeting is returning Hello World!");
        return "Hello World!";
    }

    public static void main(String[] args) {
        logger.debug("Application starting up.");
        System.out.println(new App().getGreeting());
        logger.warn("Application stopping.");
    }
}