package $283;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:30 PM 9/17/19.
 */
public class SolutionNew {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2){
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
