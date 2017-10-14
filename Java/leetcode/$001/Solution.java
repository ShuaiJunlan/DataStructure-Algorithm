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
        int temp, length = nums.length;
        int[] re = new int[2];
        for (int i = 0; i < length; i++) {
            temp = target - nums[i];
            if (hashMap.containsKey(temp)) {
                re[1] = i;
                re[0] = hashMap.get(temp);
                break;
            }
            hashMap.put(nums[i], i);
        }
        return re;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, 9)));
    }
}
