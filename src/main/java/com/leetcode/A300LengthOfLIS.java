package com.leetcode;

/**
 * Created by zh on 2019/3/11.
 */
public class A300LengthOfLIS {

    public static void main(String[] args) {
        int[] arg = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(arg));

    }

    public static int lengthOfLIS(int[] nums) {
        if (null == nums || nums.length == 0)
            return 0;
        final int len = nums.length;
        int[] args = new int[len];
        args[0] = 1;
        for (int i = 1; i < len; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && max < args[j])
                    max = args[j];
            }
            args[i] = max + 1;
        }
        int max = 1;
        for (int i : args)
            if (max < i)
                max = i;
        return max;
    }

}
