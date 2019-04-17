package $303;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:05 PM 4/17/19.
 */
public class NumArray {

    private int[] sum;
    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++){
            sum[i+1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {

        return sum[j+1] - sum[i];
    }
}
