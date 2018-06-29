package $078;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 21:06 2018/5/30.
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        sets(nums, results, new ArrayList<>(), 0, nums.length);
        return results;
    }
    public void sets(int[] nums, List<List<Integer>> lists, List<Integer> integers, int index, int length){
        lists.add(new ArrayList<>(integers));
        for (int i = index; i < length; i++){
            integers.add(nums[i]);
            sets(nums, lists, integers, i + 1, length);
            integers.remove(integers.size() - 1);
        }
    }
}
