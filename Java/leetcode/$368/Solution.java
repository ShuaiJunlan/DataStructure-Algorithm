package com.sh.leetcoder.$368;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:41 2017/3/31.
 */

/**
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(n)
 */
public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        if (nums.length == 0 || nums == null)
            return list;
        int len = nums.length;
        Arrays.sort(nums);
        //  存放最大子序列元素的个数
        int[] dp = new int[len];
        dp[0] = 1;
        //  获取满足条件的最大子序列的长度
        for (int i = 1; i < len; i++){
            for (int j = i - 1; j >= 0; j--){
                if (nums[i] % nums[j] == 0)
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
            }
        }
        //  获取满足条件的最大子序列最后一个元素的下标
        int maxIndex = 0;
        for (int i = 0; i < len; i++){
            maxIndex = dp[i] > dp[maxIndex] ? i : maxIndex;
        }

        //  最大子序列的最大元素
        int temp = nums[maxIndex];

        //  最大子序列的元素个数
        int curDp = dp[maxIndex];

        //  遍历数组，找出最大子序列
        for (int i = maxIndex; i >= 0; i--){
            if (temp % nums[i] == 0 && dp[i] == curDp){
                list.add(nums[i]);
                temp = nums[i];
                curDp--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1, 2, 4, 8};
        int[] arr2 = {3, 4, 8, 16};
        System.out.println(solution.largestDivisibleSubset(arr1).toString());
        System.out.println(solution.largestDivisibleSubset(arr2).toString());
    }
}
