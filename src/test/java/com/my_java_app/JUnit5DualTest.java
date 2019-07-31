package com.my_java_app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JUnit5DualTest {

    @Test
    void getHello() {
        JavaHello javaHello = new JavaHello();
        assertEquals("Hello, I am compiling Java with groovy.", javaHello.getHello());
    }

}
