package $260;

import java.util.Arrays;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:33 AM 2018/09/15.
 */
public class Solution {
    public int[] singleNumber(int[] nums){
        if (nums == null){
            throw new NullPointerException("nums can't be null!");
        }
        Arrays.sort(nums);
        int[] res = new int[2];
        int k = 0;
        for (int i = 1; i < nums.length;){
            if (nums[i] != nums[i-1]){
                res[k++] = nums[i-1];
                i++;
            }else {
                i += 2;
            }
        }
        if (k == 1){
            res[k] = nums[nums.length-1];
        }
        return res;
    }
}
