package com.my_java_app;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloTest {

    @Test
    public void getHello() {
        JavaHello javaHello = new JavaHello();
        assert("Hello, I am compiling Java with groovy.".equals(javaHello.getHello()));
    }
}