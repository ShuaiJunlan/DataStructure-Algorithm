package $454;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 10:26 AM 2/28/19.
 */
public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < B.length; j++){
                map.put(A[i]+B[j], map.getOrDefault(A[i]+B[j], 0)+1);
            }
        }
        int res = 0;
        for (int i = 0; i < C.length; i++){
            for (int j = 0; j < D.length; j++){
                res += map.getOrDefault(-(C[i]+D[j]), 0);
            }
        }
        return res;
    }
}
