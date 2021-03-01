package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestApp {
	
	@Test
	public void testDefault() {
		assertEquals(true, true);
	}
	
	public void testSayname() {
		Sayname say = new Sayname();
		assertEquals("Hello Ravendra", say.Sayname("Ravendra"));
	}

}
