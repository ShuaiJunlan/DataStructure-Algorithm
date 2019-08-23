package $015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:17 PM 8/23/19.
 */
public class SolutionNew {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3){
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right){
                if (nums[i] + nums[left] + nums[right] == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    left++;
                    while (left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    right--;
                } else if (nums[i] + nums[left] + nums[right] > 0){
                    while (left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    right--;
                } else {
                    while (left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    left++;
                }
            }
        }
        return result;
    }
}
