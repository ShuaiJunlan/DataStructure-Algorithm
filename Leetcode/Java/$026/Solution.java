package $026;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:19 2017/11/6.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        //  记录第几个位置将会被替换
        int j = 1;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i+1] == nums[i]){
                continue;
            }else{
                nums[j] = nums[i+1];
                j++;
            }
        }
        return j;
    }
}
