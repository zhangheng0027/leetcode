package com.leetcode;

/**
 * 
 * https://leetcode-cn.com/problems/integer-to-roman/description/
 * @author ZhangHeng
 * 
 */
public class AABCintegerToRoman {
	
	private final static String[] roman = {"", "", "I", "V", "X", "L", "C", "D", "M"};
	private final static int[]    radix = { 0,  0,  1,   5,   10,  50, 100, 500, 1000};
	
	public String intToRoman(int num) {
		StringBuffer sb = new StringBuffer();
		for (int i = radix.length - 1; i >= 2 && num > 0; i--) {
			if (num + radix[(i - 2) + i % 2] >= radix[i]) {
				if (num >= radix[i]) {
					sb.append(roman[i]);
					num -= radix[i];
					i++;
				} else {
					sb.append(roman[(i - 2) + i % 2]).append(roman[i]);
					num = num + radix[(i - 2) + i % 2] - radix[i];
				}
				
			}
		}
		return sb.toString();
    }
	
	
	/**
	 */
	public static void main(String[] args) {
		AABCintegerToRoman a = new AABCintegerToRoman();
		//for (int i = 40; i < 60; i++)
		System.out.println(a.intToRoman(3));
	}
	
}
