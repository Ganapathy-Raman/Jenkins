package com.gana.sample.NewJenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testSumOfDigits() {
		assertEquals(10,App.SumOfDigits(55));
	}
	
	@Test
	void testMaximumDigits() {
		assertEquals(7,App.MaximumDigits(176));
	}
	
	@Test
	void testIncreasingOrder() {
		assertEquals(true,App.IncreasingOrder(678));
	}
	
	@Test
	void testFibonacciSeries() {
		assertEquals(3,App.FibonacciSeries(4));
	}
	
	@Test
	void testsubSetArray() {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4};
		assertArrayEquals(arr2,App.subSetArray(arr1,arr2));
	}
	

	
}
