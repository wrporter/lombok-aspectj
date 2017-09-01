package com.test;

import lombok.Data;

import java.util.UUID;

@Data
public class MyObject
{
    private String id;

    public MyObject()
    {
        id = UUID.randomUUID().toString();
    }
}
