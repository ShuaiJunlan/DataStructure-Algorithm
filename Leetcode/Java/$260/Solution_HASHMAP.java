package $260;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:21 PM 3/12/19.
 */
public class Solution_HASHMAP {
    public int[] singleNumber(int[] nums) {
        if (nums == null){
            return null;
        }
        HashSet<Integer> hashSet = new HashSet<>(nums.length);
        for (int num : nums) {
            if (!hashSet.add(num)) {
                hashSet.remove(num);
            }
        }
        int[] re = new int[2];
        int i = 0;
        for (Integer integer : hashSet) {
            re[i++] = integer;
        }
        return re;
    }
}
