package $137;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:39 PM 3/12/19.
 *
 * TODO: https://www.cnblogs.com/grandyang/p/4263927.html
 */
public class Solution_ONE {
    public int singleNumber(int[] nums) {
        if (nums == null){
            return 0;
        }
        int res = 0;
        for (int i = 0; i < 32; i++){
            int sum = 0;
            for (int j = 0; j < nums.length; j++){
                sum += (nums[j] >> i) & 1;
            }
            res += ((sum % 3) << i);
        }
        return res;
    }
}
