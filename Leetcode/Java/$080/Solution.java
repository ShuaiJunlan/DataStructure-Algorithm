package $080;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 8:37 PM 2018/07/11.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null){
            return 0;
        }
        if (nums.length <= 2){
            return nums.length;
        }
        int ans = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[ans - 2] != nums[i] || nums[ans - 1] != nums[i]){
                nums[ans++] = nums[i];
            }
        }
        return ans;
    }
}
