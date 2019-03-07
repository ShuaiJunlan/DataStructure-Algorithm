package sort;

import java.util.Arrays;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:45 PM 3/7/19.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,1, 12,34,2,1,3,1};
        int[] test = new int[arr.length];
        System.arraycopy(arr, 0, test, 0, arr.length);
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);

        Arrays.sort(test);
        System.out.println(Arrays.toString(arr).equals(Arrays.toString(test)));
    }
    public void sort(int[] arr){
        int[] temp = new int[arr.length];
        help(arr, 0, temp.length-1, temp);
    }
    public void help(int[] arr, int left, int right, int[] temp){
        if (left < right){
            int mid = left + ((right-left)>>1);
            help(arr, left, mid, temp);
            help(arr, mid+1, right,temp);
            merge(arr, left, mid, right, temp);
        }
    }
    private void merge(int[] arr, int left, int mid, int right, int[] temp){
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right){
            if (arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid){
            temp[k++] = arr[i++];
        }
        while (j <= right){
            temp[k++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, left, right-left+1);
    }
}

