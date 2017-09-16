package com.test;

import lombok.Data;
import org.junit.Test;

import java.util.UUID;

public class LombokTest
{
    @Data
	public static class MyTestObject {
		private String id;
		
		public MyTestObject() {
			id = UUID.randomUUID().toString();
		}
	}
	
	@Test
	public void test() {
		new MyTestObject().getId();
	}
}
