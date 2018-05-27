package $077;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 12:32 2018/5/27.
 */
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists = new ArrayList<>();
        bfs(lists, new ArrayList<>(), 1, 0, n, k);
        return lists;
    }
    public void bfs(List<List<Integer>> lists, List<Integer> re, int index, int count, int n, int k){
        if (count == k){
            lists.add(new ArrayList<>(re));
            return;
        }
        for (int i = index; i <= n; i++){
            re.add(i);
            bfs(lists, re, i+1, count+1, n, k);
            re.remove(re.size()-1);
        }
    }
}
