package $167;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 12:49 PM 2/23/19.
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target){
        assert numbers != null && numbers.length > 1;
        int left = 0, right = numbers.length - 1, temp;
        while (left < right){
            temp = numbers[left] + numbers[right];
            if (temp == target){
                break;
            }else if (temp < target){
                left++;
            }else {
                right--;
            }
        }
        return new int[]{left+1, right+1};
    }
}
