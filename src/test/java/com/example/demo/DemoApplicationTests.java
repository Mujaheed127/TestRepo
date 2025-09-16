package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void testHelloEndpoint() {
        DemoApplication app = new DemoApplication();
        String response = app.hello();
        assertEquals("Hello from CI/CD!", response);
    }
}
