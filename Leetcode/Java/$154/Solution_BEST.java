package $154;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:15 AM 2/19/19.
 */
public class Solution_BEST {
    public int findMin(int[] nums){
        assert  nums != null && nums.length != 0;
        int left = 0, right = nums.length - 1;
        while (left + 1 < right){
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > nums[right]){
                left = mid;
            }else if (nums[mid] < nums[right]){
                right = mid;
            }else {
                right--;
            }
        }
        return Math.min(nums[left], nums[right]);
    }
}
