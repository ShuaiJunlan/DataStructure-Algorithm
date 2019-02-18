package $152;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:42 PM 2/18/19.
 *
 * TODO： 最大连续子数组和
 *  https://github.com/julycoding/The-Art-Of-Programming-By-July/blob/master/ebook/zh/02.04.md
 */
public class Solution {
    public int maxProduct(int[] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int ans = nums[0], max = ans, min = ans;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] >= 0){
                max = Math.max(nums[i], max * nums[i]);
                min = Math.min(nums[i], min * nums[i]);
            }else {
                int temp = max;
                max = Math.max(nums[i], min * nums[i]);
                min = Math.min(nums[i], temp * nums[i]);
            }
            ans = Math.max(ans, max);
        }
        return ans;
    }
}
