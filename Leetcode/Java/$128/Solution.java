package $128;

import java.util.HashMap;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:10 PM 3/3/19.
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>(nums.length);
        int res = 0;
        for (int n : nums){
            if (!hashMap.containsKey(n)){
                Integer t;
                int left = ((t = hashMap.get(n-1)) == null) ? 0 : t;
                int right = ((t = hashMap.get(n+1)) == null) ? 0 : t;

                int sum = left + right + 1;
                hashMap.put(n, sum);
                res = Math.max(res, sum);
                hashMap.put(n-left, sum);
                hashMap.put(n+right, sum);
            }
        }
        return res;
    }
}
