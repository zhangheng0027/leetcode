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
        int [] a = {186,419,83,408};
        System.out.println(coinChange1(a, 6249));
    }

    /**
     * 节省一部分空间
     * @param coins
     * @param amount
     * @return
     */
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        if (null == coins || coins.length < 1)
            return -1;
        Arrays.sort(coins);
        int max = Math.min(coins[coins.length - 1], amount);
        int[] args = initArgs(max, -1);
        for (int i = coins[0]; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
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
                if (temp + 1 < min)
                    min = temp + 1;
            }
            if (min == Integer.MAX_VALUE)
                min = -1;
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

    /**
     *
     * @param coins
     * @param amount
     * @return
     */
    public static int coinChange1(int[] coins, int amount) {
        int[] args = new int[amount + 1];
        args[0] = 0;
        Arrays.sort(coins);
        for (int i = 1; i <= amount; i++) {
            int min = -1;
            for (int j : coins) {
                if (i == j) {
                    min = 1;
                    break;
                }
                if (i < j)
                    break;
                int temp = args[i - j] + 1;
                if (temp > 1 && (min == -1 || min > temp))
                    min = temp;
            }
            args[i] = min;
        }
        return args[amount];
    }

}
