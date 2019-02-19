package $162;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:42 AM 2/19/19.
 */
public class Solution_BEST {
    public int findPeakElement(int[] nums){
        assert nums != null && nums.length != 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] > nums[i]){
                return i-1;
            }
        }
        return nums.length - 1;
    }
}
