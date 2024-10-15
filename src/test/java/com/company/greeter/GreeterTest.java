package com.company.greeter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello, world!", Greeter.sayHello("world"));
    }
}
