package $078;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionNew {
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0){
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        help(result, new ArrayList<>(), nums, 0, nums.length);
        return result;
    }
    private void help(List<List<Integer>> result, List<Integer> list, int[] nums, int start, int length){
        result.add(new ArrayList<>(list));
        for (int i = start; i < length; i++){
            list.add(nums[i]);
            help(result, list, nums, i+1, length);
            list.remove(list.size()-1);
        }
    }
}
