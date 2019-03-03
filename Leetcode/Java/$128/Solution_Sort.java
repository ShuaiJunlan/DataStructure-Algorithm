package $128;

import java.util.Arrays;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:49 PM 3/3/19.
 */
public class Solution_Sort {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 1;
        int cur = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                cur++;
            } else {
                cur = 1;
            }
            res = Math.max(res, cur);
        }
        return res;
    }
}
