package $217;

import java.util.HashSet;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:30 AM 4/4/19.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int a : nums){
            if (set.contains(a)){
                return true;
            }
            set.add(a);
        }
        return false;
    }
}
