package $031;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 7:21 PM 8/23/19.
 */
public class SolutionNew {
    public void nextPermutation(int[] num){
        if (num == null || num.length  < 2){
            return;
        }
        int index = 0, j = num.length - 1;
        while (j > 0){
            if (num[j-1] < num[j]){
                break;
            }
            j--;
        }
        if (j == 0){
            reserveSort(num, j, num.length-1);
            return;
        }
        for (int i = num.length-1; i >= j; i--){
            if (num[i] > num[j-1]){
                swap(num, j-1, i);
                reserveSort(num, j, num.length-1);
                break;
            }
        }

    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void reserveSort(int[] num, int start, int end){
        if (start >= end){
            return;
        }
        for (int i = start; i <= ((start+end) >> 1); i++){
            swap(num, i, start+end-i);
        }
    }
}
