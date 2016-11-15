/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.*/

package com.exercise;
import java.util.Stack;


public class BalancedParantheses {	
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<Character>();
		char c;
		for(int i=0; i < str.length(); i++) {
			c = str.charAt(i);
			if(c == '(' || c == '{' || c == '[')
				stack.push(c);
			else if(c == '}') {
				if(stack.empty())
					return false;
				else if(stack.peek() == '{')
					stack.pop();
				else
					return false;
			}
			else if(c == ')') {
				if(stack.empty())
					return false;
				else if(stack.peek() == '(')
					stack.pop();
				else
					return false;
			}	
			else if(c == ']'){
				if(stack.empty())
					return false;
				else if(stack.peek() == '[')
					stack.pop();
				else 
					return false;
			}        
		}
		return stack.empty();
	}

	public static void main(String[] args) {        
		String str = "{}()[]";
		System.out.println(isBalanced(str)); 
	}
}




