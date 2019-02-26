package $216;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:05 PM 2/26/19.
 */
public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> re = new LinkedList<>();
        bfs(0, 0, k, n, 1, new ArrayList<>(3), re);
        return re;
    }
    private void bfs(int sum, int step, int k, int target, int i, List<Integer> list, List<List<Integer>> re){
        if (sum == target && step == k){
            re.add(new ArrayList<>(list));
            return;
        }
        if (sum >= target || step >= k){
            return;
        }
        for (int j = i; j < 10; j++){
            list.add(j);
            bfs(sum + j, step + 1, k, target, j + 1, list, re);
            list.remove(list.size()-1);
        }
    }
}
