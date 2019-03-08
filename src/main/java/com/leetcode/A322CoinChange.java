package com.leetcode;

import java.util.Arrays;

/**
 * Created by zh on 2019/3/8.
 *
 * https://leetcode-cn.com/problems/coin-change/
 *
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

 Example 1:

 Input: coins = [1, 2, 5], amount = 11
 Output: 3
 Explanation: 11 = 5 + 5 + 1
 Example 2:

 Input: coins = [2], amount = 3
 Output: -1
 Note:
 You may assume that you have an infinite number of each kind of coin.

 */
public class A322CoinChange {

    public static void main(String[] args) {
        int [] a = {1,2147483647};
        System.out.println(coinChange(a, 2));
    }

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        if (null == coins || coins.length < 1)
            return -1;
        Arrays.sort(coins);
        int max = Math.min(coins[coins.length - 1], amount);
        int[] args = initArgs(max, -1);
        for (int i = coins[0]; i <= amount; i++) {
            int min = -1;
            for (int j : coins) {
                if (i == j) {
                    min = 1;
                    break;
                } else if (i < j) {
                    break;
                }
                int temp = args[(i - j) % max];
                if (temp == -1)
                    continue;
                if (temp + 1 < min || (min == -1 && temp > 0))
                    min = temp + 1;
            }
            args[i % max] = min;
        }
        return args[amount % max];
    }

    private static int[] initArgs(int len, int num) {
        int[] args = new int[len];
        for (int i = 0; i < len; i++)
            args[i] = num;
        return args;
    }

}
