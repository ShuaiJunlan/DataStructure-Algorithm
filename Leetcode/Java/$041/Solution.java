package $041;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 21:54 2018/5/12.
 */
class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0){
            return 1;
        }
        int n = nums.length;
        for(int i = 0; i < n; ++ i) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
            }
        }
        for(int i = 0; i < n; ++ i){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }
        return n + 1;
    }
}
