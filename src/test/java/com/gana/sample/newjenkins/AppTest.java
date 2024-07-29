package com.gana.sample.newjenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testSumOfDigits() {
		assertEquals(10, App.sumOfDigits(55));
	}

	@Test
	void testMaximumDigits() {
		assertEquals(7, App.maximumDigits(176));
	}

	@Test
	void testIncreasingOrder() {
		assertEquals(true, App.increasingOrder(678));
	}

	@Test
	void testFibonacciSeries() {
		assertEquals(3, App.fibonacciSeries(4));
	}

	@Test
	void testsubSetArray() {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 3, 4 };
		assertArrayEquals(arr2, App.subSetArray(arr1, arr2));
	}

}
