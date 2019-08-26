package $004;

public class Solution {
    public boolean findNum(int[][] nums, int target){
        if (nums == null || nums.length == 0){
            return false;
        }
        int row = 0, cloumn = nums[0].length - 1;
        while (row < nums.length && cloumn >= 0){
            if (nums[row][cloumn] == target){
                return true;
            }else if (nums[row][cloumn] > target){
                cloumn--;
            }else {
                row++;
            }
        }
        return false;
    }

}
