package com.test;

import org.junit.Test;

public class MyTest {

    @Test
    public void meh() {
        MyObject o = new MyObject();
        System.out.println(o);
        YourClass y = new YourClass();
        y.yourMethodAround();
    }
}
