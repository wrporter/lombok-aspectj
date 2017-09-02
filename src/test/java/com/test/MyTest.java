package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * You need to set Intellij compiler to Javac instead of Ajc in Preferences/Build/Compiler
 */
public class MyTest {

    @Test
    public void meh() {
        MyObject o = new MyObject();
        o.setId("meh");
        assertEquals(o.getId(), "meh");
        System.out.println(o);
        YourClass y = new YourClass();
        y.yourMethodAround();
    }
}
