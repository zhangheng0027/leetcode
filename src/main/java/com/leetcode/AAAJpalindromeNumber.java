package com.leetcode;

/**
 * 
 * https://leetcode-cn.com/problems/palindrome-number/description/
 * @author ZhangHeng
 * 
 */
public class AAAJpalindromeNumber {
	public boolean isPalindrome(int x) {
        
		char[] c = String.valueOf(x).toCharArray();
		int left = 0;
		int right = c.length - 1;
		
		while (left <= right) {
			if (c[left] != c[right])
				return false;
			left++;
			right--;
		}
		return true;
    }
	
	public static void main(String[] args) {
		AAAJpalindromeNumber a = new AAAJpalindromeNumber();
		System.out.println(a.isPalindrome(12321));
	}
}
