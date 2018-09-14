package com.leetcode;

/**
 * 
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 * @author zhangH
 *
 */
public class AAADlongestSubstringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
        int left = 0;
		int right = 0;
		int result = 0;
		
		while (right < s.length()) {
			for (int i = left; i < right; i++) {
				if (s.charAt(right) == s.charAt(i)) {
					left = i + 1;
					break;
				}
			}
			if (result < right - left + 1)
				result = right - left + 1;
			right++;
		}
        
		return result;
    }
	
}
