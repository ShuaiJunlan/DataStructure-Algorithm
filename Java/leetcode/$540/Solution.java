package com.sh.leetcoder.$540;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:36 2017/3/14.
 */
public class Solution {
    /**
     * 先分析数字规律，采用二分查找的方式，时间复杂度为0(lgn),空间复杂度为O(1)
     *
     * @param nums
     * @return
     */
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 0)
            return -1;
        if (nums.length == 1)
            return nums[0];

        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start < end) {
            mid = (start + end + 1) / 2;
            if ((mid & 1) == 1) {
                if (nums[mid] == nums[mid + 1])
                    end = mid - 1;
                else
                    start = mid + 1;

            } else {
                if (nums[mid] == nums[mid - 1])
                    end = mid - 2;
                else
                    start = mid;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] nums1 = {3, 3, 7, 7, 10, 11, 11};
        int[] nums2 = {1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8};
        int[] nums3 = {1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8};
        System.out.println(solution.singleNonDuplicate(nums));
        System.out.println(solution.singleNonDuplicate(nums1));
        System.out.println(solution.singleNonDuplicate(nums2));
    }
}
