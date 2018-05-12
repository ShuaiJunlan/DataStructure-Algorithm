package $040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 21:08 2018/5/11.
 */
public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0){
            return result;
        }
        Arrays.sort(candidates);
        backtrace(candidates, result, new ArrayList<>(), 0, target);
        return result;
    }
    public void backtrace(int[] candidates, List<List<Integer>> result, List<Integer> list, int index, int remain){
        if (remain < 0){
            return;
        }
        if (remain == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < candidates.length; i++){
            // why this condition can skip duplicates
            if (i > index && candidates[i] == candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            backtrace(candidates, result, list, i + 1, remain - candidates[i]);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        solution.combinationSum2(arr, target);
    }
}
