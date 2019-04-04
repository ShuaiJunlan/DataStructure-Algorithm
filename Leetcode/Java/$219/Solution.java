package $219;

import java.util.HashMap;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:26 AM 4/4/19.
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            Integer temp;
            if ((temp = map.get(nums[i])) != null){
                if (Math.abs(temp-i) <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

}
