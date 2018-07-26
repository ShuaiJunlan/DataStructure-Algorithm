package $081;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:53 AM 2018/07/26.
 */
public class Solution {
    public boolean search(int[] nums, int target) {

        int left = 0, right =  nums.length - 1, mid;

        while(left <= right) {
            mid = (left + right) >> 1;
            if(nums[mid] == target){
                return true;
            }

            // the only difference from the first one, trickly case, just update left and right
            if( (nums[left] == nums[mid]) && (nums[right] == nums[mid]) ) {
                ++left;
                --right;
            } else if(nums[left] <= nums[mid]) {
                if( (nums[left]<=target) && (nums[mid] > target) ){
                    right = mid-1;
                } else{
                    left = mid + 1;
                }
            } else {
                if((nums[mid] < target) &&  (nums[right] >= target) ){
                    left = mid+1;
                } else{
                    right = mid-1;
                }

            }
        }
        return false;
    }
}
