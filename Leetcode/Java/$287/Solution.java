package $287;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:40 AM 10/24/19.
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("");
        }
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] == i + 1) {
                continue;
            }
            if (nums[i] == nums[nums[i] - 1]) {
                break;
            }
            while (nums[i] != i + 1) {
                if (nums[i] == nums[nums[i] - 1]) {
                    return nums[i];
                }
                swap(nums, i, nums[i] - 1);
            }
        }
        return nums[i];
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
