package com.exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sumofNumTest {
	@Test
	public void testPositive() {
		int[] arr = {2,4,5,0,78,2,3,5,1};
		sumofNum sn = new sumofNum();
		Assert.assertTrue(sn.sumofn(arr,2));
	}
	
	@Test
	public void testPositive_singleElement() {
		int[] arr = {-6,4,5,0,78,2,3,5,-6};
		sumofNum sn = new sumofNum();
		Assert.assertTrue(sn.sumofn(arr,1));
	}
	
	@Test(expectedExceptions = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testException() {
		int[] arr = {2,4,5,0,78,2,3,5,1};
		sumofNum sn = new sumofNum();
		sn.sumofn(arr,10);
	}
	
	@Test
	public void testNegative_Incorrect() {
		int[] arr = {2,4,5,0,78,2,3,5,-1};
		sumofNum sn = new sumofNum();
		Assert.assertFalse(sn.sumofn(arr,2));
	}
	
	@Test
	public void testPositive_negativeValues() {
		int[] arr = {-2,2,5,0,78,2,3,5,-5};
		sumofNum sn = new sumofNum();
		Assert.assertTrue(sn.sumofn(arr,2));
	}
	
	@Test
	public void testPositive_zero() {
		int[] arr = {0,0,5,0,78,2,3,0,0};
		sumofNum sn = new sumofNum();
		Assert.assertTrue(sn.sumofn(arr,2));
	}
	
}
