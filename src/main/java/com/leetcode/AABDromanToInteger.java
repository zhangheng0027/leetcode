package com.leetcode;


import java.util.HashMap;
import java.util.Map;


public class AABDromanToInteger {
	
	//private final static JSONObject json = JSONObject.parseObject("{I:1, V:5, X:10, L:50, C:100, D:500, M:1000}");
	static Map<String, Integer> json = new HashMap<String, Integer>();
	static {
        json.put("I", 1);
        json.put("V", 5);
        json.put("X", 10);
        json.put("L", 50);
        json.put("C", 100);
        json.put("D", 500);
        json.put("M", 1000);
	}
	
	public int romanToInt(String s) {
        final int len = s.length();
		int last = 0;
        int result = 0;
		for (int i = len - 1; i >= 0; i--) {
			int j = json.get(s.substring(i, i + 1));
			if (j >= last) {
				result += j;
				last = j;
			} else {
				result -= j;
				
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		AABDromanToInteger a = new AABDromanToInteger();
		System.out.println(a.romanToInt("IV"));
	}
}
