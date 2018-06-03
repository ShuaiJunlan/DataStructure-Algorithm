package $096;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 21:33 2018/6/3.
 */
public class Solution {
    public int numTrees(int n) {
        if (n <= 1){
            return n;
        }
        int[] nums = new int[n+1];
        nums[1] = 1;
        for (int i = 2; i <= n; i++){
            nums[i] += 2 * nums[i-1];
            for (int j = 1; j <= (i - 2); j++){
                nums[i] += (nums[i-j-1] * nums[j]);
            }
        }
        return nums[n];
    }
}
