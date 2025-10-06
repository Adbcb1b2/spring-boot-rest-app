package com.simple.web;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloTests {

    @Test
    public void testHello() {
        var controller = new HelloController();
        String result = controller.hello();
        assertNotNull(result);
        assertTrue(result.contains("ello"));
    }

    // True unit test, not integration
    // Doesnt test interactions with Spring MVC
    // Just tests translations into JSON
    @Test
    public void testCustomer() {
        var controller = new HelloController();
        var result = controller.getCustomer();

        assertEquals (result.getId(), 1);
        assertEquals (result.getName(), "Srinivas");
        assertEquals (result.getEmail(), "mail@mail.com");
    }
}
