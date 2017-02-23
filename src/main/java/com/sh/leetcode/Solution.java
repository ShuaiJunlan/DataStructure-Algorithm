package com.sh.leetcode;

/**
 * Created by Mr SJL on 2016/11/18.
 *
 * @author Junlan Shuai
 */
public class Solution
{
    public int singleNumber(int[] A)
    {
        //  先对数组进行排序
        selectionSort(A);
        //  每相邻两位相等，不等则输出
        for (int k = 0; k < A.length - 1; k += 2)
        {
            if (A[k] != A[k + 1])
            {
                return A[k];
            }
        }
        return A[A.length - 1];
    }

    /**
     * 选择排序
     *
     * @param A
     */
    public void selectionSort(int[] A)
    {
        for (int i = 0; i < A.length; i++)
        {
            int max = i;
            for (int j = i + 1; j < A.length; j++)
            {
                if (A[j] > A[max])
                {
                    max = j;
                }

            }
            swap(A, i, max);
        }
    }
    public void swap(int[] A, int a, int b)
    {
        int t = A[b];
        A[b] = A[a];
        A[a] = t;
    }
}
