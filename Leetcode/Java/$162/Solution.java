package $162;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:27 AM 2/19/19.
 */
public class Solution {
    public int findPeakElement(int[] nums) {
        assert nums != null && nums.length != 0;
        if (nums.length == 1){
            return 0;
        }
        if (nums[0] > nums[1]){
            return 0;
        }
        if (nums[nums.length-1] > nums[nums.length-2]){
            return nums.length-1;
        }
        for (int i = 1; i < nums.length - 1; i++){
            if (nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                return i;
            }
        }
        throw new IllegalArgumentException("");
    }
}
