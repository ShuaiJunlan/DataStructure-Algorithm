package com.sh.offer.$30;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 19:$23 2017/3/1.
 */

import com.sh.basicalgorithm.sort.quicksort.QuickSort;

/**
 * 求最小的k个数
 */
public class $30 {
    private final static QuickSort quickSort = new QuickSort();

    /**
     * 获得最小的k个数
     *
     * @param array
     * @param length
     * @param k
     */
    public void getMinKValue(int[] array, int length, int k) {
        if (array == null || length <= 0 || length < k)
            return;
        int index = quickSort.partition(array, 0, array.length - 1);
        while (index != k - 1) {
            if (index < k) {
                index = quickSort.partition(array, index + 1, array.length - 1);
            } else
                index = quickSort.partition(array, 0, index - 1);
        }
    }

    /**
     * 获得最大的k个数
     *
     * @param array
     * @param length
     * @param k
     */
    public void getMaxKValue(int[] array, int length, int k) {
        if (array == null || length <= 0 || length < k)
            return;
        int index = quickSort.partition(array, 0, array.length - 1);
        int temp = length - k - 1;
        while (index != temp) {
            if (index < temp)
                index = quickSort.partition(array, index + 1, length - 1);
            else
                index = quickSort.partition(array, 0, index - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        $30 o = new $30();
        o.getMaxKValue(a, a.length, 8);
        int temp = a.length - 1;
        for (int i = 0; i < 8; i++)
            System.out.println(a[temp--]);
    }
}
