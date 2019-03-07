package com.leetcode.spring2019;

/**
 * Created by zh on 2019/3/6.
 * https://leetcode-cn.com/explore/interview/card/top-interview-quesitons-in-2018/261/before-you-start/1107/
 *
 *
 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.

 Example 1:

 Input: [3,2,3]
 Output: 3
 Example 2:

 Input: [2,2,1,1,1,2,2]
 Output: 2
 *
 */
public class B002MajorityElement {

    public static void main(String[] args) {
        int[] arg = {2,2,1,1,1,2,2};
        majorityElement(arg);
    }

    public static int majorityElement(int[] nums) {
        if (null == nums)
            return -1;
        final int len = nums.length - 1;
        int head = 0;
        for (int right = 1, num = 1;right < len; right++) {
            if (nums[head] == nums[right]) {
                num++;
                continue;
            }
            num--;
            if (num == 0) {
                num = 1;
                head = right + 1;
                right++;
            }
        }
        return nums[head];
    }


}
