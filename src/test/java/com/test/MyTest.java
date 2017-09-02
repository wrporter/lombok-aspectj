package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTest {

    @Test
    public void meh() {
        MyObject o = new MyObject();
        o.setId("meh");
        assertEquals(o.getId(), "");
        System.out.println(o);
        YourClass y = new YourClass();
        y.yourMethodAround();
    }
}
