package $136;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 18:22 2018/8/30.
 */
public class Solution {
    public int singleNumber(int[] nums){
        int sum  = 0;
        for (int i = 0; i < nums.length; i++){
            sum ^= nums[i];
        }
        return sum;
    }
}
