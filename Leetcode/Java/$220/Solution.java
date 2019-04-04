package $220;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:24 PM 4/4/19.
 */
public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0){
            return false;
        }
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j <= k + i && j < nums.length; j++){
                if (Math.abs((long) nums[j]-nums[i]) <= (long) t){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,5,9,1,5,9};
        int[] arr1 = {2,2};
        solution.containsNearbyAlmostDuplicate(arr1, 3, 0);
        System.out.println(Integer.MAX_VALUE);
    }
}
