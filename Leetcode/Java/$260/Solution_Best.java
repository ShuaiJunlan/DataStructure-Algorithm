package $260;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:49 AM 2018/09/15.
 *
 * TODO: http://www.cnblogs.com/grandyang/p/4741122.html
 */
public class Solution_Best {
    public int[] singleNumber(int[] nums){
        int diff = 0;
        // Get the XOR of the two numbers we need to find
        for (int num: nums){
            diff ^= num;
        }
        // Get its last set bit
        diff &= -diff;

        int[] res = new int[2];
        for (int num: nums){
            // the bit is not set
            if ((num & diff) == 0){
                res[0] ^= num;
            }else { // the bit is set
                res[1] ^= num;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution_Best solution_best = new Solution_Best();
        int[] arr = {1,2,1,3,2,5};
        solution_best.singleNumber(arr);
    }
}
