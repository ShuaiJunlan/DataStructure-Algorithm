package $553;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:37 2017/4/16.
 */
public class Solution {
    public String optimalDivision(int[] nums) {
        float re = nums[0];
        int pos = 0;
        for (int i = 1; i < nums.length; i++) {
            re /= nums[i];
        }
        for (int i = nums.length - 1; i >= 1; i--) {
            float temp = nums[0];
            for (int j = 1; j <= i; j++) {
                temp /= nums[j];
            }
            for (int k = i + 1; k < nums.length; k++) {
                temp *= nums[k];
            }
            if (temp > re)
                pos = i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false;
        for (int i = 1; i <= nums.length; i++) {
            stringBuilder.append(nums[i - 1]);
            if (i == nums.length)
                break;
            else if (i == pos) {
                stringBuilder.append("/(");
                flag = true;
            } else
                stringBuilder.append("/");
        }
        if (flag)
            stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1000, 100, 10, 2};
        System.out.println(solution.optimalDivision(nums));
    }
}
