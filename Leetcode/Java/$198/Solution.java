package $198;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:10 2017/5/10.
 */

/**
 * Simple description: get a sub sequence of the array, it must satisfy that every pair element in this sub sequence</br>
 * must not be adjacent and the sum of the this sub sequence must be the max in all sub sequence of the array ;
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int robNo = 0;                          //  store max money if not rob current house
        int robYes = 0;                         //  store max money if rob current house
        for (int n : nums) {                    //  loop the array
            int temp = robNo;
            robNo = Math.max(robNo, robYes);    //  if not rob current house,take the max value of robNo and robYes
            robYes = n + temp;                  //  if rob current house,previous house must not be robbed
        }
        return Math.max(robNo, robYes);         //  return the max value
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,2,3,4,5};
        System.out.println(solution.rob(arr));
    }
}
