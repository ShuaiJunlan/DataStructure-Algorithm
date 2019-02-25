package $189;


/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:31 PM 2/25/19.
 */
public class Solution {
    public void rotate(int[] nums, int k){
        if (k <= 0){
            return;
        }
        k %= nums.length;
        int[] re = new int[nums.length];
        System.arraycopy(nums, nums.length - k, re, 0, k);
        System.arraycopy(nums, 0, re, k, nums.length - k);
        System.arraycopy(re, 0, nums, 0, nums.length);
    }
}
