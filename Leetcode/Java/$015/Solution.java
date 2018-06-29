package $015;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:54 2018/4/2.
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arrayLists = new ArrayList<>();

        if (nums == null || nums.length < 3){
            return arrayLists;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){

            int left = i + 1, right = nums.length - 1, sum = 0 - nums[i];
            while (left < right){
                if (nums[left] + nums[right] == sum){
                    arrayLists.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while (right > left && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if (nums[left] + nums[right] < sum){
                    left++;
                }else {
                    right--;
                }

            }
            // pay attention to this
            while (i < nums.length - 1 && nums[i] == nums[i+1]){
                i++;
            }

        }
        return arrayLists;
    }
}
