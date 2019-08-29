package $300;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:26 PM 8/29/19.
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int size = 0;
        int[] tails = new int[nums.length];
        for (int x : nums){
            int i = 0, j = size;
            while (i != j){
                int m = (i+j)/2;
                if (tails[m] < x){
                    i = m + 1;
                }else {
                    j = m;
                }
            }
            tails[i] = x;
            if (i == size){
                size++;
            }
        }
        return size;
    }
}
