package com.leetcode;

/**
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 * @author zhangHeng
 *
 */
public class AABElongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        String result = "";
        try {
        for (int i = 0; i < strs[0].length(); i++) {
        	
        	for (int j = 1; j < strs.length; j++) {
        		char c = strs[0].charAt(i);
        		if (c != strs[j].charAt(i)) {
        			return result;
        		}
        	}
        	result += strs[0].charAt(i);
        }
        } catch (StringIndexOutOfBoundsException  e) {
        	
        } catch (ArrayIndexOutOfBoundsException e) {}
        
		return result;
    }
	
	
	public static void main(String[] args) {
		AABElongestCommonPrefix a = new AABElongestCommonPrefix();
		String[] arr = {};
		System.out.println(a.longestCommonPrefix(arr));
		
	}
}
