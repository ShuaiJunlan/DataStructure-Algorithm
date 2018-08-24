package $033;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 7:30 PM 2018/07/27.
 */
public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return -1;
        }
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long num = (nums[mid] < nums[0]) == (target < nums[0]) ? nums[mid]
                    : target < nums[0] ? Long.MIN_VALUE : Long.MAX_VALUE;
            if (num > target) {
                hi = mid - 1;
            } else if (num < target) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
