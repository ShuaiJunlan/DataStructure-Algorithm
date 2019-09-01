package sort;

import java.util.Arrays;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:44 PM 8/30/19.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,4,1,6,5};
        int[] arr2 = new int[]{2,1};
        int[] arr3 = new int[]{2};
        int[] arr4 = new int[]{};
        int[] arr5 = new int[]{1,2,3,6,6,3};
        int[] arr6 = new int[]{1,2,3,6,6,3,456,345,345,34,45,6456,756,7,32454576,567,678,678,345,456,5678,689,789};
        quickSort(arr1, 0, arr1.length-1);
        quickSort(arr2, 0, arr2.length-1);
        quickSort(arr3, 0, arr3.length-1);
        quickSort(arr4, 0, arr4.length-1);
        quickSort(arr5, 0, arr5.length-1);
        quickSort(arr6, 0, arr6.length-1);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));

    }
    private static void quickSort(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int temp = partition(nums, start, end);
        quickSort(nums, start, temp-1);
        quickSort(nums, temp+1, end);

    }
    private static int partition(int[] nums, int start, int end ){
        int left = start + 1, right = end;
        while(left < right){
            while(nums[left] <= nums[start] && left < right){
                left++;
            }
            while(nums[right] > nums[start] && left < right){
                right--;
            }
            swap(nums, left, right);
        }
        if (nums[left] > nums[start]){
            left--;
        }
        swap(nums, start, left);
        return left;
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
