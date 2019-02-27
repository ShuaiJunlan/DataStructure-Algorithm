package $209;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:00 PM 2/27/19.
 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int i = 0, j = 0, min = Integer.MAX_VALUE, sum = 0;
        while (j < nums.length){
            sum += nums[j++];
            while (sum >= s && i < j){
                min = Math.min(j - i, min);
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
