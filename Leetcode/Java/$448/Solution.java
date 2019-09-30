package $448;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:05 PM 9/30/19.
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        for (int i = 0; i < nums.length; i++) {
            help(i, nums);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums[i]) {
                list.add(i + 1);
            }
        }
        return list;
    }

    private void help(int i, int[] arr) {
        while (arr[i] != i + 1) {
            if (arr[arr[i] - 1] == arr[i]) {
                return;
            }
            swap(arr, arr[i] - 1, i);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
