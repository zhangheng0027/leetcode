package com.leetcode;



/**
 * https://leetcode-cn.com/problems/zigzag-conversion/description/
 * @author ZhangHeng
 * 
 */
public class A006zigzagConversion {
	
	/**
	 * n = 5
	*i=0  1     2
	*
	 * 0  8     16      (n - 1) * 2 * i
	 * 1 7 9  15  17    (n - 1) * 2 * i + 1; (n - 1) * 2 * (i + 1) - 1
	 * 2 6 10 14  18    (n - 1) * 2 * i + 2; (n - 1) * 2 * (i + 1) - 2
	 * 3 5 11 13  19    (n - 1) * 2 * i + 3; (n - 1) * 2 * (i + 1) - 3
	 *  4    12     20  (n - 1) * 2 * i + (n - 1)
	 * 
	 */
	
	public String convert(String s, int numRows) {
        if (null == s || "".equals(s) || numRows <= 1)
        	return s;
        StringBuffer sb = new StringBuffer();
        final int n = 2 * numRows - 2;
        final int len = s.length();
        final int maxI = len / ((numRows - 1) * 2) + 1;
        
        try {
	        for (int i = 0; i < maxI; i++)
	        	sb.append(s.charAt(n * i));
        } catch (StringIndexOutOfBoundsException e) {
        	
        }
        for (int j = 1; j < numRows - 1; j++) {
        	try {
	        	for (int i = 0; i < maxI; i++) 
	        		sb.append(s.charAt(n * i + j)).append(s.charAt(n * (i + 1) - j));
        	} catch (StringIndexOutOfBoundsException e) {
            	
            }
        }
        try {
	        for (int i = 0; i < maxI; i++) 
	        	sb.append(s.charAt(n * i + numRows - 1));
        } catch (StringIndexOutOfBoundsException e) {
        	
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		A006zigzagConversion a = new A006zigzagConversion();
		System.out.println(a.convert("abcdefg", 3));
		
	}
	
}
