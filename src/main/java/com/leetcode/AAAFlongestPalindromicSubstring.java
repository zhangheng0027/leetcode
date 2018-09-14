package com.leetcode;


/**
 * https://leetcode-cn.com/problems/longest-palindromic-substring/description/
 * @author zhangheng
 *
 */
public class AAAFlongestPalindromicSubstring {
	
	private String chuli(String s) {
		StringBuffer sb = new StringBuffer("#");
		if (null == s)
			return sb.toString();
		final int len = s.length();
		for (int i = 0; i < len; i++)
			sb.append(s.charAt(i)).append("#");
		return sb.toString();
	}
	
	public String longestPalindrome(String s) {
		if (null == s || "".equals(s))
			return s;
		String str = chuli(s);
		final int len = str.length();
		
		int core = 0;  // 记录中心位置
		int left = 0; //记录最右边的位置
		
		int max = 0;
		int maxIndex = 0;
		
		int[] A = new int[len]; 
		for (int i = 0; i < len; i++) {
			
			if (i <= left) {
				A[i] = A[2 * core - left + 1]; // 将对称位置的值给A[i]
			} else {
				A[i] = 0;
			}
			
			while ((i - A[i] - 1) >= 0 && (i + A[i] + 1) < len && str.charAt(i - A[i] - 1) == str.charAt(i + A[i] + 1)) {
				A[i]++;
			}
			
			if (A[i] + core > left) {
				left = A[i];
				core = i;
			}
			
			if (A[i] > max) {
				max = A[i];
				maxIndex = i;
			}
		}
		
		return s.substring((maxIndex - max) / 2, (maxIndex + max + 1) / 2);
	}
	
	public static void main(String args[]) {
		AAAFlongestPalindromicSubstring a = new AAAFlongestPalindromicSubstring();
		System.out.println(a.longestPalindrome("babad"));
	}
	
}
