package $154;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:08 AM 2/19/19.
 */
public class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0){
            throw new NullPointerException();
        }
        int min = nums[0];
        for (int i = 1; i < nums.length; i++){
            min = Math.min(min, nums[i]);
        }
        return min;
    }
}
