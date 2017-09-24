package com.sh.leetcoder.$548;

import java.util.HashSet;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:54 2017/4/5.
 */
public class Solution {

    public boolean splitArray(int[] nums) {
        if (nums == null || nums.length < 7)
            return false;
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = nums[i] + sum[i - 1];
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 3; i + 3 < nums.length; i++) {
            int sum_1, sum_2;
            for (int j = 1; j + 1 < i; j++) {
                sum_1 = sum[j - 1];
                sum_2 = sum[i - 1] - sum[j];
                if (sum_1 == sum_2)
                    hashSet.add(sum_1);
            }
            int sum_3, sum_4;
            for (int k = i + 2; k + 1 < nums.length; k++) {
                sum_3 = sum[k - 1] - sum[i];
                sum_4 = sum[nums.length - 1] - sum[k];
                if (sum_3 == sum_4 && hashSet.contains(sum_3))
                    return true;
            }
            hashSet.clear();
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 1, 1, 1, 1, 4, 1, 7, 3, 7};
        int[] b = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] c = {1, 1, 1, 1, 1, 1, 1};
        int[] d = {0, 0, 0, 0, 0, 0, 0};
        int[] e = {10, 2, 11, 13, 1, 1, 1, 1, 1};
        int[] f = {1, 2, 1, 3, 0, 0, 2, 2, 1, 3, 3};
        int[] g = {1, 2, -1, 1, 2, 5, 2, 5, 2};
        Solution solution = new Solution();
        System.out.println(solution.splitArray(a));
        System.out.println(solution.splitArray(b));
        System.out.println(solution.splitArray(c));
        System.out.println(solution.splitArray(d));
        System.out.println(solution.splitArray(e));
        System.out.println(solution.splitArray(f));
        System.out.println(solution.splitArray(g));
    }
}
