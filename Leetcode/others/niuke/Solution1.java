package niuke;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 6:06 PM 8/22/19.
 *
 * 最大连续子序列和
 */
public class Solution1 {
    public int maxSum(int[] arr){
        if (arr == null || arr.length == 0){
            return 0;
        }
        int maxSum = arr[0], maxHere = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (maxHere < 0){
                maxHere = arr[i];
            }else {
                maxHere += arr[i];
            }
            if (maxHere > maxSum){
                maxSum = maxHere;
            }
        }
        return maxSum;
    }
}
