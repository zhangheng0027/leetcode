package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zh on 2019/3/9.
 *
 * https://leetcode-cn.com/problems/triangle/
 *
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

 For example, given the following triangle

 [
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
 ]
 The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

 Note:

 Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 */
public class A120MinimumTotal {

    public static void main(String[] args) {

        List<List<Integer>> l = new ArrayList<>();
        List<Integer> t1 = new ArrayList<>();
        t1.add(2);
        l.add(t1);
        List<Integer> t2 = new ArrayList<>();
        t2.add(3);
        t2.add(4);
        l.add(t2);
        List<Integer> t3 = new ArrayList<>();
        t3.add(6);
        t3.add(5);
        t3.add(7);
        l.add(t3);
        List<Integer> t4 = new ArrayList<>();
        t4.add(4);
        t4.add(1);
        t4.add(8);
        t4.add(3);
        l.add(t4);
        System.out.println(minimumTotal1(l));

    }

    /**
     * 第一版
     * @param triangle
     * @return
     */
    public static int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(triangle.get(0));
        int len = triangle.size();
        for (int i = 1; i < len; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(triangle.get(i).get(0) + result.get(i - 1).get(0));
            for (int j = 1; j < i; j++) {
                temp.add(Math.min(result.get(i - 1).get(j - 1), result.get(i - 1).get(j)) + triangle.get(i).get(j));
            }
            temp.add(triangle.get(i).get(i) + result.get(i - 1).get(i - 1));
            result.add(temp);
        }
        int min = 0x7fffffff;
        for (Integer i : result.get(len - 1)) {
            if (i < min)
                min = i;
        }
        return min;
    }

    public static int minimumTotal1(List<List<Integer>> triangle) {
        final int len = triangle.size();
        int[] args = new int[len + 1]; // 实际只用到 len 长度，不想每次减1
        args[0] = 0x7fffffff;
        args[len] = triangle.get(0).get(0);
        for (int i = 1; i < len; i++) {
            args[len - i] = triangle.get(i).get(0) + args[len - i + 1];
            for (int j = 1; j < i; j++)
                args[len - i + j] = Math.min(args[len - i + j], args[len - i + j + 1]) + triangle.get(i).get(j);
            args[len] += triangle.get(i).get(i);
        }
        int min = 0x7fffffff;
        for (int i : args)
            if (min > i)
                min = i;
        return min;
    }
}
