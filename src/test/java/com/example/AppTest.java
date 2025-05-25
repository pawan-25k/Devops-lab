package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testSayHello() {
        App app = new App();
        String greeting = app.sayHello();
        Assert.assertEquals("Hello, Welcome to Jenkins!", greeting);
    }
}
