package com.sh.leetcoder.$322;

import java.util.Arrays;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:24 2017/5/16.
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (coins == null || coins.length == 0) return -1;
        int count = 0;
        Arrays.sort(coins);
        for (int i = coins.length-1; i >= 0; i--){
            count += amount / coins[i];
            amount = amount % coins[i];
        }
        if (amount != 0) return -1;
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(solution.coinChange(coins, amount));

        int[] coins1 = {2};
        amount = 3;
        System.out.println(solution.coinChange(coins1, amount));
    }
}
