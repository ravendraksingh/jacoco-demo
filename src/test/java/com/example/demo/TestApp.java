package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestApp {

	/*
	 * This method tests Sayname  
	 */
	
	@Test
	public void testSayname() {
		Sayname say = new Sayname();
		assertEquals("Hello Ravendra", say.Sayname("Ravendra"));
	}
}
