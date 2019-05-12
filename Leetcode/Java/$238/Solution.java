package $238;

import java.util.Arrays;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 5:01 PM 5/12/19.
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0){
            return new int[0];
        }
        int countZero = 0;
        int zeroIndex = -1;
        int allElementsProduct = 1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                countZero++;
                zeroIndex = i;
                continue;
            }
            allElementsProduct *= nums[i];
        }
        if (countZero == 1){
            Arrays.fill(nums, 0);
            nums[zeroIndex] = allElementsProduct;
            return nums;
        }
        if (countZero >= 2){
            return new int[nums.length];
        }
        for (int  i = 0; i < nums.length; i++){
            nums[i] = allElementsProduct / nums[i];
        }
        return nums;
    }
}
