package $198;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:59 PM 2/25/19.
 */
public class Solution_Optimize {
    public int rob(int[] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int robNo = 0;
        int robYes = nums[0];
        for (int i = 1; i < nums.length; i++){
            int temp = robNo;
            robNo = Math.max(robNo, robYes);
            robYes = Math.max(temp+nums[i], robYes);
        }
        return Math.max(robNo, robYes);
    }
}
