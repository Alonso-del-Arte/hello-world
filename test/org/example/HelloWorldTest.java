package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void testGreeting() {
        System.out.println("greeting");
        String expected = "Hello, world!";
        String actual = HelloWorld.greeting();
        assertEquals(expected, actual);
    }

}