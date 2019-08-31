package $674;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:20 PM 8/29/19.
 */
public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int maxValue = 1, current = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > nums[i-1]){
                current++;
                maxValue = Math.max(maxValue, current);
            }else {
                current = 1;
            }
        }
        return maxValue;
    }
}
