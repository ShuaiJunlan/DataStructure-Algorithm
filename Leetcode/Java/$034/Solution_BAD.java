package $034;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:39 AM 2018/08/07.
 */
public class Solution_BAD {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums == null || nums.length == 0){
            return result;
        }
        int length = nums.length, left = 0, right = length - 1;
        int mid = right - ((right - left) >> 1);
        while (left <= right){
            if (nums[mid] == target){
                result[0] = result[1] = mid;
                while (--result[0] >= 0 && nums[result[0]] == target){}
                ++result[0];
                while (++result[1] < length && nums[result[1]] == target){}
                --result[1];
                return result;

            }else if (nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
            mid = right - ((right - left) >> 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution_BAD solutionBAD = new Solution_BAD();
        int[] arr = {5};
        solutionBAD.searchRange(arr, 5);
    }

}
