package com.sh.leetcoder.$213;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:15 2017/5/15.
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;         //  check nums array
        if (nums.length == 1) return nums[0];                   //  simpler cases

        //  break the circle, assume that the first houses is not robbed, or the last house is not robbed, get the max value in these two cases
        return Math.max(robHelper(0, nums.length - 2, nums), robHelper(1, nums.length - 1, nums));
    }
    private int robHelper(int lo, int hi, int[] nums){
        int robNo = 0,                                          //  store the max value in which current houses is not robbed
                robYes = 0;                                     //  store the max value in which current houses is robbed
        for (int i = lo; i <= hi; i++){
            int temp = robNo;
            robNo = Math.max(robNo, robYes);                    //  get the max value in which current house is not robbed
            robYes = temp + nums[i];                            //  get the max value in which current house is robbed
        }
        return Math.max(robNo, robYes);                         //  get the max value at the end
    }
}