package $047;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:22 2018/5/17.
 */
public class Solution {
    private List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        lists.clear();
        if (nums == null || nums.length == 0){
            return lists;
        }
        bfs(nums,0);
        return lists;
    }
    public void bfs(int[] nums, int index){
        if (index == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int num : nums){
                list.add(num);
            }
            lists.add(list);
            return;
        }
        // skip the duplicate element
        Set<Integer> integerSet = new HashSet<>();
        for (int i = index; i < nums.length; i++){
            if (integerSet.add(nums[i])){
                swap(nums, i, index);
                bfs(nums, index+1);
                swap(nums, i, index);
            }
        }
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        Integer a = 33;
        Integer b = 33;
        Boolean c = (a == b);
        System.out.println(c);
    }

}
