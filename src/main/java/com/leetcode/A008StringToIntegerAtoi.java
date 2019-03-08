package com.leetcode;

/**
 * 
 * https://leetcode-cn.com/problems/string-to-integer-atoi/description/
 * @author ZhangHeng
 * 
 */
public class A008StringToIntegerAtoi {
	
	public int myAtoi(String str) {
        if (null == str)
        	return 0;
		char[] c = str.toCharArray();
		int i = 0;
		final int len = c.length;
		while (i < len && (c[i] <= ' '))
			i++;
		
		boolean flag = false;
		boolean flagN = false;
		StringBuffer s = new StringBuffer();
		try {
			for (; i < len; i++) {
				if (c[i] >= '0' && c[i] <= '9') {
					s.append(c[i]);
				}else {
					if (!flag && (c[i] == '-' || c[i] == '+')) {
						s.append(c[i]);
						flagN = c[i] == '-';
					}
					else return Integer.valueOf(s.toString());
				}
				flag = true;
			}
			return Integer.valueOf(s.toString());
		} catch (NumberFormatException e) {
			if (s.length() <= 1)
				return 0;
			return flagN ? -2147483648 : 2147483647;
		}
    }
	
	public static void main(String[] args) {
		A008StringToIntegerAtoi a = new A008StringToIntegerAtoi();
		System.out.println(a.myAtoi("aa123"));
	}
	
}
