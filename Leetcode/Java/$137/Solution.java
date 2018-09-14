package $137;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 7:05 PM 2018/09/14.
 */
public class Solution {
    public int singleNumber(int[] nums){
        if (nums == null){
            throw new NullPointerException("nums is null!");
        }
        int ones = 0, twos = 0;
        for (int i = 0; i < nums.length; i++){
            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }
        return ones;
    }
}
