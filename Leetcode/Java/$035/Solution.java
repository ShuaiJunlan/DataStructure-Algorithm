package $035;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:36 2017/11/6.
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int i = 0;
        for (; i < nums.length; i++){
            if (target == nums[i]){
                return i;
            }else if (target < nums[i]){
                return i;
            }
        }
        return i;
    }
}
