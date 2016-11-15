package com.exercise;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BalancedParenthesesTests {

	@Test
	public void testPositive() {
		String str = "{}()[]";
		Assert.assertTrue(BalancedParantheses.isBalanced(str));
	}
	
	@Test
	public void testPositivewithnumber() {
		String str = "{}8()[]";
		Assert.assertTrue(BalancedParantheses.isBalanced(str));
	}
	@Test
	public void testPositivewithexpression() {
		String str = "{}(7*5)[]";
		Assert.assertTrue(BalancedParantheses.isBalanced(str));
	}

	@Test
	public void testNegative_unbalanced() {
		String str = "{()[]";
		Assert.assertFalse(BalancedParantheses.isBalanced(str));
	}
	@Test
	public void testNegative_unbalancedsinglecharacter() {
		String str = "{";
		Assert.assertFalse(BalancedParantheses.isBalanced(str));
	}
	
	@Test
	public void testPositive_NullString() {
		String str = "";
		Assert.assertTrue(BalancedParantheses.isBalanced(str));
	}
	@Test
	public void testNegative_number() {
		String str = "{()9[]";
		Assert.assertFalse(BalancedParantheses.isBalanced(str));
	}
	
}
