package $823;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:36 2018/4/23.
 */
public class Solution {
    public int numFactoredBinaryTrees(int[] A) {
        if (A == null || A.length == 0){
            return 0;
        }
        Arrays.sort(A);
        Map<Integer, Long> map = new HashMap<>(A.length);
        for (int i = 0; i < A.length; i++){
            long count = 1;
            for (int j = 0; j < i; j++){
                if (A[i] % A[j] == 0 && map.containsKey(A[i]/A[j])){
                    count = count + map.get(A[j]) * map.get(A[i]/A[j]);
                }
            }
            map.put(A[i], count);
        }
        long sum = 0;
        for (long num : map.values()){
            sum = sum + num;
        }
        return (int)(sum % 1000000007);
    }
}
