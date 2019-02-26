package $039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 20:14 2018/5/9.
 */
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0){
            return result;
        }
        Arrays.sort(candidates); //soring
        back(result, new ArrayList<>(), candidates, 0, target);
        return result;
    }
    private void back(List<List<Integer>> lists, List<Integer> tmp, int[] candidates, int index, int remain){
        if (remain == 0){
            lists.add(new ArrayList<>(tmp));
            return;
        }
        if (remain < 0){
            return;
        }
        for (int i = index; i < candidates.length && remain >= candidates[i]; i++){
            tmp.add(candidates[i]);
            back(lists, tmp, candidates, i, remain - candidates[i]);
            tmp.remove(tmp.size()-1);
        }
    }
}
