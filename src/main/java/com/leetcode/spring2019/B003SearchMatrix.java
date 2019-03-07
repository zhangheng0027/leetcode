package com.leetcode.spring2019;

/**
 * Created by zh on 2019/3/6.
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-quesitons-in-2018/261/before-you-start/1108/
 *
 *
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted in ascending from left to right.
 Integers in each column are sorted in ascending from top to bottom.
 Example:

 Consider the following matrix:

 [
 [1,   4,  7, 11, 15],
 [2,   5,  8, 12, 19],
 [3,   6,  9, 16, 22],
 [10, 13, 14, 17, 24],
 [18, 21, 23, 26, 30]
 ]
 Given target = 5, return true.

 Given target = 20, return false.
 *
 */
public class B003SearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (null == matrix || null == matrix[0])
            return false;
        final int len1 = matrix.length;
        final int len2 = matrix[0].length;
        int min = Math.min(len1, len2);
        for (int i = 0; i < min; i ++) {
            
        }
        return false;
    }

}
