package com.sh.leetcoder.$494;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:23 2017/5/9.
 */
public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if (nums.length == 0 || nums == null)
            return 0;
        int sum = 0;        //  记录数组中所有元素之和
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if (S > sum || sum < -sum)
            return 0;
        int[] dp = new int[2 * sum + 1];
        dp[0+sum] = 1;
        for (int i = 0; i < nums.length; i++){
            int[] next = new int[2*sum+1];
            for (int j = 0; j < 2*sum + 1; j++){
                if (dp[j] != 0){
                    next[j - nums[i]] += dp[j];
                    next[j + nums[i]] += dp[j];
                }
            }
            dp = next;
        }
        return dp[sum + S];
    }
}
