package $031;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:31 AM 2018/08/08.
 */
public class Solution {
    public void nextPermutation(int[] num){
        if (num == null || num.length < 2){
            return;
        }
        int n = num.length;
        int index = n - 1;
        while (index > 0){
            if (num[index - 1] < num[index]){
                break;
            }
            index--;
        }
        if (index == 0){
            reserveSort(num, 0, n-1);
        }else {
            int val = num[index-1], j = n - 1;
            while (j >= index){
                if (num[j] > val){
                    break;
                }
                j--;
            }
            swap(num, index-1, j);
            reserveSort(num, index, n-1);
        }

    }
    private void swap(int[] num, int i, int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    private void reserveSort(int[] num, int start, int end){
        if (start > end){
            return;
        }
        for (int i = start; i <= ((start + end) >> 1); i++){
            swap(num, i, start + end - i);
        }
    }
}
