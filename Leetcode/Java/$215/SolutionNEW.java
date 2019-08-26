package $215;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:32 PM 8/26/19.
 */
public class SolutionNEW {
    public int findKthLargest(int[] nums, int k) {
        return help(nums, nums.length - k, 0, nums.length-1);
    }
    private int help(int[] nums, int k, int left, int right){
        if (left == right){
            return nums[left];
        }
        int tempLeft = left, tempRight = right;
        while (left < right){
            while (nums[left] <= nums[tempLeft] && left < right){
                left++;
            }
            while (nums[right] > nums[tempLeft] && left < right){
                right--;
            }
            swap(nums, left, right);
        }
        if (nums[left] > nums[tempLeft]){
            left--;
        }
        swap(nums, tempLeft, left);
        if (k == left){
            return nums[k];
        }else if (k < left){
            return help(nums, k, tempLeft, left-1);
        }else {
            return help(nums, k, left+1, tempRight);
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        SolutionNEW solution = new SolutionNEW();
        int[] nums = new int[]{2,1};
        System.out.println(solution.findKthLargest(nums, 1));
    }
}
