package com.test;

public class YourClass
{
    private MyObject myObject;

    public YourClass()
    {
        myObject = new MyObject();
    }

    public MyObject getMyObject()
    {
        return myObject;
    }

    public static void main(String[] args)
    {
        YourClass yourClass = new YourClass();
        yourClass.yourMethodAround();
    }

    @YourAnnotation
    public void yourMethodAround()
    {
        System.out.println("My function: " + getMyObject());
        throw new RuntimeException("Oh no!");
    }
}
