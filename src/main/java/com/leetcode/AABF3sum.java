package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * https://leetcode-cn.com/problems/3sum/description/
 * @author ZhangHeng
 *
 */
public class AABF3sum {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> l = new ArrayList<List<Integer>>();
        if (null == nums || nums.length < 3)
        	return l;
		Arrays.sort(nums);
		final int len = nums.length;
		
		for (int right = 2; right < len; right++) {
			
			int tar = -nums[right];
			for (int left = 0, centre = right - 1; centre > left;) {
				int sum = nums[left] + nums[centre];
				
				if (sum == tar) {
					l.add(Arrays.asList(nums[left], nums[centre], nums[right]));
					left++;
					centre--;
					while (centre > left && nums[left] == nums[left - 1]) left++;
					while (centre > left && nums[centre] == nums[centre + 1]) centre--;
				} else if (sum > tar) {
					centre--;
				} else 
					left++;
			}
			
		}
		
		return l;
    }
	
	
	public static void main(String[] args) {
		
		int[] arr = {0, 0, 0};
		System.out.println(new AABF3sum().threeSum(arr).toString());
		System.out.println(8 >>4);
		
	}
	
}
