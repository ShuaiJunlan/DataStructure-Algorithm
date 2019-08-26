package $003;

public class Solution {
    public int getDuplicateNum(int[] nums){
        if (nums == null || nums.length < 1){
            return 0;
        }
        int[] temp = new int[nums.length];
        for (int a : nums){
            if (temp[a] > 0){
                return a;
            }else {
                temp[a] += 1;
            }
        }
        return 0;
    }
}
