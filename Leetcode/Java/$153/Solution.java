package $153;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:16 PM 2/18/19.
 */
public class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0){
            throw new NullPointerException();
        }
        int left = 0, right = nums.length - 1, mid = 0;
        if (nums[right] >= nums[left]){
            return nums[left];
        }
        while (left < right){
            mid = left + ((right-left)>>1);
            if (nums[mid] > nums[left]){
                left = mid;
            } else if (nums[mid] == nums[left]){
                return Math.min(nums[left], nums[right]);
            } else {
                right = mid;
            }
        }
        return nums[mid];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,4,5,1,2};
        solution.findMin(nums);
    }
}
