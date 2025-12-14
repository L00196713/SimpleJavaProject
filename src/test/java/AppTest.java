package com.cicd.simple;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for the App class.
 */
public class AppTest {

    @Test
    public void testGetGreetingMessage() {
        App app = new App();
        // Assert that the method returns the expected string
        assertEquals("Hello World!", app.getGreeting());
    }
    
    @Test
    public void testAlwaysPasses() {
        // A second test that always passes, just to generate a full report
        assertEquals(2 + 2, 4);
    }
}