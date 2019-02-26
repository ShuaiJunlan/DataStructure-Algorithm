package $215;


/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:28 PM 2/26/19.
 *
 * Why???
 */
public class Solution {
    public int findKthLargest(int[] nums, int k){
        // Arrays.sort(nums);
        // return nums[nums.length -(k-1)];
        k = nums.length - k;
        int lo = 0, hi = nums.length-1;
        while (lo < hi){
            int j = partition(nums, lo, hi);
            if (j < k){
                lo = j + 1;
            }else if (j > k){
                hi = j - 1;
            }else {
                break;
            }
        }
        return nums[k];
    }
    private int partition(int[] a, int lo, int hi){
        int i = lo, j = hi + 1;
        // while (i<j){
        //     while (i < hi && a[++i] < a[lo]);
        //     while (j > lo && a[lo] < a[--j]);
        //
        //     exchange(a, i, j);
        // }
        while (true){
            while (i < hi && a[++i] < a[lo]);
            while (j > lo && a[lo] < a[--j]);
            if (i >= j){
                break;
            }
            exchange(a, i, j);
        }
        exchange(a, lo, j);
        return j;
    }
    private void exchange(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
