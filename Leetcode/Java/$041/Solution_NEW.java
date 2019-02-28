package $041;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:14 AM 2/28/19.
 */
public class Solution_NEW {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0){
            return 1;
        }
        for (int i = 0; i < nums.length; i++){
            // if nums[i] == i+1, that nums[i] == nums[nums[i]-1]
            while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]){
                int temp = nums[i];
                nums[i] = nums[nums[i]-1];
                nums[temp-1] = temp;

            }
        }
        for (int j = 0; j < nums.length; j++){
            if (j != nums[j] - 1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}
