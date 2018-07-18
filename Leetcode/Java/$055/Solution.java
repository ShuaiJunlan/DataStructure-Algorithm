package $055;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:06 PM 2018/07/18.
 *
 * Greatly
 */
public class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1){
            return true;
        }
        int stepsRequired = 1;
        for (int i = nums.length - 2; i >= 0; i--, stepsRequired++) {
            if (nums[i] >= stepsRequired){
                stepsRequired = 0;
            }
        }
        return stepsRequired == 1;
    }
}
