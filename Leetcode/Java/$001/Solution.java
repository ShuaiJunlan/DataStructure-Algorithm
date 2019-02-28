package $001;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:12 2017/3/15.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Integer temp, length = nums.length;
        for (int i = 0; i < length; i++) {

            if ((temp = hashMap.get(target-nums[i])) != null) {
                return new int[]{i, temp};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, 9)));
    }
}
