package $268;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:08 PM 4/29/19.
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (;i < nums.length; i++){
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }
}
