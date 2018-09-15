package $260;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:49 AM 2018/09/15.
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
}
