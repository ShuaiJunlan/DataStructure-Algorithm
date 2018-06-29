package $403;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 18:08 2017/5/3.
 */
public class Solution2 {
    public boolean canCross(int[] stones) {
        if (stones.length == 0) return true;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        map.put(0, new HashSet<>());
        map.get(0).add(1);
        for (int i = 1; i < stones.length; i++){
            map.put(stones[i], new HashSet<>());
        }
        for (int i = 0; i < stones.length - 1; i++){
            int stone = stones[i];
            for (int step : map.get(stone)){
                int reach = stone + step;
                if (reach == stones[stones.length - 1])
                    return true;
                HashSet<Integer> set = map.get(reach);
                if (set != null){
                    set.add(step);
                    if (step - 1 > 0)
                        set.add(step - 1);
                    set.add(step + 1);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] a = {0, 1, 3, 5, 6, 8, 12, 17};
        int[] a1 = {0, 1, 2, 3, 4, 8, 9, 11};
        int[] a2 = {0};
        int[] a3 = {0, 1};
        int[] a4 = {};
        System.out.println(solution.canCross(a));
        System.out.println(solution.canCross(a1));
        System.out.println(solution.canCross(a2));
        System.out.println(solution.canCross(a3));
        System.out.println(solution.canCross(a4));
    }
}
