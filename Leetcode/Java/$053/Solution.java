package $053;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:22 2017/5/3.
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < nums.length; i++){
            temp += nums[i];
            sum = sum > temp ? sum : temp;
            if (temp < 0){
                temp = 0;
            }
        }
        return sum;
    }
}
