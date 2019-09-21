package $283;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:54 PM 9/17/19.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2){
            return;
        }
        int zeroIndex = 0, nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                zeroIndex = i;
                for (int j = i+1; j < nums.length; j++){
                    if (nums[j] != 0){
                        nonZeroIndex = j;
                        swap(nums, zeroIndex, nonZeroIndex);
                        break;
                    }
                }
            }
        }
    }
    private void swap(int[] arr, int i, int j){
        if (i < 0 || i >= arr.length || j < 0 || j >= arr.length){
            throw new IllegalArgumentException("Illegal arguments i and j");
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
