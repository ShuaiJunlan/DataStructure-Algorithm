package $046;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:19 2018/3/27.
 */
public class Solution {
    private List<List<Integer>> lists = null;
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0){
            return lists;
        }
        lists = new ArrayList<>();
        permutations(nums, 0, nums.length);
        return lists;
    }
    public void permutations(int[] nums, int st, int len){
        if (st == len - 1){
            List<Integer> current = new ArrayList<>();
            for (int a : nums) {
                current.add(a);
            }
            lists.add(current);
        }else {
            for (int i = st; i < len; i++){
                swap(nums, st, i);
                permutations(nums, st+1, len);
                swap(nums, st, i);
            }
        }
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
