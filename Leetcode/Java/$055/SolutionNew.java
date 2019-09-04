package $055;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 5:36 PM 9/4/19.
 */
public class SolutionNew {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length <= 1){
            return true;
        }
        int requoiredSteps = 1;
        for (int i = nums.length - 2; i >= 0; i--, requoiredSteps++){
            if (nums[i] >= requoiredSteps){
                requoiredSteps = 0;
            }
        }
        return requoiredSteps == 1;
    }
}
