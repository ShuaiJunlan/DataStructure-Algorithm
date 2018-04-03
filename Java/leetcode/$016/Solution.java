package $016;

import java.util.Arrays;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:18 2018/4/3.
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++){
            int left = i + 1, right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < target){
                    left++;
                }else {
                    right--;
                }
                if (Math.abs(target - sum) < Math.abs(target - closest)){
                    closest = sum;
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 0};
        Solution solution = new Solution();
        System.out.println(solution.threeSumClosest(a, 1));
    }
}
