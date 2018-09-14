package com.leetcode;


/**
 * 
 * https://leetcode-cn.com/problems/reverse-integer/description/
 * @author ZhangHeng
 *
 */
public class AAAHreverseInteger {
	
	public int reverse(int x) {
		String str = String.valueOf(x);
		StringBuffer sb = new StringBuffer();
        if (x < 0) {
        	str = str.substring(1, str.length());
        	sb.append("-");
        }
        sb.append(new StringBuffer(str).reverse());
        try {
        	return Integer.valueOf(sb.toString());
        } catch (NumberFormatException e) {
        	
        }
        return 0;
    } 
	
	public static void main(String[] args) {
		AAAHreverseInteger a = new AAAHreverseInteger();
		System.out.println(a.reverse(1534236469));
	}
	
}
