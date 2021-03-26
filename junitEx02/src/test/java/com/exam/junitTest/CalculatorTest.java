package com.exam.junitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator c = new Calculator();
		
		double result = c.sum(10, 20);
		
		assertEquals(30, result, 0);
	}
	
}








