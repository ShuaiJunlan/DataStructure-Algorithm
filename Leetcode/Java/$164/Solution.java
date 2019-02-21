package $164;

import java.util.Arrays;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:30 PM 2/21/19.
 */
public class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        int re = 0;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] > nums[i-1]){
                re = re > (nums[i] - nums[i-1]) ? re : (nums[i] - nums[i-1]);
            }
        }
        return re;
    }
}
