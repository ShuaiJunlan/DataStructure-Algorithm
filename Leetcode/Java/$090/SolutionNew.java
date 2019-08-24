package $090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionNew {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null || nums.length == 0){
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        help(lists, new ArrayList<>(), nums, 0);
        return lists;
    }
    public void help(List<List<Integer>> result, List<Integer> list, int[] nums, int index){
        result.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++){
            if (i != index && nums[i] == nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            help(result, list, nums, i+1);
            list.remove(list.size()-1);
        }
    }

    /**
     * wrong answer : [1,2,3]
     * @param result
     * @param list
     * @param nums
     * @param index
     */
    public void help1(List<List<Integer>> result, List<Integer> list, int[] nums, int index){
        result.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++){
            if (i != index && nums[i] == nums[i-1]){
                continue;
            }
            list = new ArrayList<>();
            for (int j = i; j < nums.length; j++){
                list.add(nums[j]);
                result.add(new ArrayList<>(list));
            }
        }
    }
}
